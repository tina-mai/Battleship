import java.util.ArrayList;

public class Ship {
    private String name;
    private int length;
    private ArrayList<int[]> coordinates;
    // ship names - aircraft carrier, battleship, cruiser, submarine, and destroyer
    // 5,4,3,3,2

    public Ship(String name, int length ) {
        coordinates = new ArrayList<int[]>();
        this.name = name;
        this.length = length;
    }



}