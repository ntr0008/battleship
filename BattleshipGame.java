import java.util.ArrayList;
import java.util.Scanner;

public class BattleshipGame {
    private ArrayList<Battleship> battleships = new ArrayList<>();
    private GameHelper helper = new GameHelper();
    private int totalGuesses = 0;

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame();
        game.setupGame();
        game.playGame();
    }

    public void setupGame() {
        Battleship battleship1 = new Battleship("Battleship 1");
        Battleship battleship2 = new Battleship("Battleship 2");
        Battleship battleship3 = new Battleship("Battleship 3");

        battleships.add(battleship1);
        battleships.add(battleship2);
        battleships.add(battleship3);

        for (Battleship battleship : battleships) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            battleship.setLocationCells(newLocation);
        }

        System.out.println("Welcome to Battleship!\n");
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (!battleships.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess (e.g., a0):");
            totalGuesses++;

            String result = checkUserGuess(userGuess);
            System.out.println(result);
        }

        System.out.println("Congratulations! You sank all battleships in " + totalGuesses + " guesses.");
        scanner.close();
    }

    public String checkUserGuess(String userGuess) {
        for (Battleship battleship : battleships) {
            String result = battleship.checkGuess(userGuess);
            if (result.equals("Sunk")) {
                battleships.remove(battleship);
                return "You sank " + battleship.getName() + "!";
            } else if (result.equals("Hit")) {
                return "Hit!";
            }
        }
        return "Miss";
    }
}
