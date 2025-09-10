package Codeforces;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class  the_nether {

    // Fast I/O utilities
    private static BufferedReader reader;
    private static PrintWriter writer;

    /**
     * Helper class to store path length and starting node ID.
     * Replaces C++ std::pair.
     */
    private static class PathData {
        int len;
        int id;

        PathData(int len, int id) {
            this.len = len;
            this.id = id;
        }
    }

    /**
     * Sends a query to the judge and returns the response.
     *
     * @param qNode The starting node for the path query.
     * @param nodeSet The set of nodes to check intersection with.
     * @return The size of the intersection.
     */
    private static int query(int qNode, List<Integer> nodeSet) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("? ").append(qNode).append(" ").append(nodeSet.size());
        for (int node : nodeSet) {
            sb.append(" ").append(node);
        }
        writer.println(sb.toString());
        writer.flush();

        String response = reader.readLine();
        if (response == null) System.exit(0);
        int result = Integer.parseInt(response);
        if (result == -1) System.exit(0);
        return result;
    }

    /**
     * Submits the final computed path as the answer.
     *
     * @param finalPath The list of nodes in the path.
     */
    private static void submitAnswer(List<Integer> finalPath) {
        String resultString = finalPath.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ", "! " + finalPath.size() + " ", ""));
        writer.println(resultString);
        writer.flush();
    }

    /**
     * Main logic to solve a single test case.
     */
    private static void solve() throws IOException {
        int n = Integer.parseInt(reader.readLine());

        // Phase 1: Determine the longest path length from each node
        List<Integer> allNodes = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        List<PathData> pathInfos = new ArrayList<>();
        int[] pathLengths = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            pathLengths[i] = query(i, allNodes);
            pathInfos.add(new PathData(pathLengths[i], i));
        }

        // Sort to find the node that starts the longest path
        pathInfos.sort((a, b) -> Integer.compare(b.len, a.len));

        PathData startPoint = pathInfos.get(0);
        int maxLen = startPoint.len;
        int startNode = startPoint.id;

        // Phase 2: Reconstruct the path step-by-step
        List<Integer> resultPath = new ArrayList<>();
        resultPath.add(startNode);
        boolean[] isUsed = new boolean[n + 1];
        isUsed[startNode] = true;
        int currentNode = startNode;

        while (resultPath.size() < maxLen) {
            // Find all potential next nodes in the path
            List<Integer> candidates = new ArrayList<>();
            for (PathData pd : pathInfos) {
                if (!isUsed[pd.id] && pathLengths[pd.id] == pathLengths[currentNode] - 1) {
                    candidates.add(pd.id);
                }
            }

            if (candidates.isEmpty()) {
                break; // Should not happen in a valid test case
            }

            int nextNode = -1;
            if (candidates.size() == 1) {
                nextNode = candidates.get(0);
            } else {
                // If multiple candidates, ask the judge to identify the adjacent one
                for (int candidateNode : candidates) {
                    if (query(currentNode, Arrays.asList(currentNode, candidateNode)) == 2) {
                        nextNode = candidateNode;
                        break;
                    }
                }
            }

            if (nextNode != -1) {
                resultPath.add(nextNode);
                isUsed[nextNode] = true;
                currentNode = nextNode;
            } else {
                break; // Could not determine the next node
            }
        }
        submitAnswer(resultPath);
    }

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new PrintWriter(System.out);
        int testCases = Integer.parseInt(reader.readLine());
        while (testCases-- > 0) {
            solve();
        }
        writer.close();
        reader.close();
    }
}