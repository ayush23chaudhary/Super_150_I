package lec35_Abstraction;

public class Cars implements Comparable<Cars> {
    int price;
    int speed;
    String colour;
    public Cars(){

    }
    public Cars(int price,int speed, String colour){
        this.price= price;
        this.speed=speed;
        this.colour= colour;;
    }
    public String toString(){
        return "P || "+ price+ " S || "+speed+" C "+colour;
    }

    @Override
    public int compareTo(Cars o){
        return 0;
    }

}
