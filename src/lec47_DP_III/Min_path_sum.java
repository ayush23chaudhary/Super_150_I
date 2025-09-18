package lec47_DP_III;

public class Min_path_sum {
    public static void main(String[] args) {
//        int[][] grid ={};
        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        int[][] dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(Minimum_Path_Sum(grid, 0, 0, dp));

    }

    public static int Minimum_Path_Sum(int[][] grid,int cr, int cc, int[][] dp){
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }
        if (cr >= grid.length || cc >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        if (dp[cr][cc] != -1) {
            return dp[cr][cc];
        }
        int right = Minimum_Path_Sum(grid, cr, cc + 1, dp);
        int down = Minimum_Path_Sum(grid, cr + 1, cc, dp);
        return dp[cr][cc] = Math.min(right, down) + grid[cr][cc];
    }

}
