import java.util.ArrayList;

public class Battleship {
    private String name;
    private ArrayList<String> locationCells;

    public Battleship(String name) {
        this.name = name;
        locationCells = new ArrayList<>();
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public String checkGuess(String userGuess) {
        String result = "Miss";

        int index = locationCells.indexOf(userGuess);
        if (index >= 0) {
            locationCells.remove(index);
            result = locationCells.isEmpty() ? "Sunk" : "Hit";
        }

        return result;
    }
}