# Battleship Game

This is a simple Battleship game implemented in Java. The game allows you to guess the locations of battleships and sink them.

## How the Code Functions

The code is organized into three classes:

1. `BattleshipGame`: This class manages the game's flow. It sets up battleships, takes user guesses, and informs the player about hits and sunk battleships.

2. `Battleship`: The `Battleship` class represents the actual battleship objects. Battleships have a name, location, and can check a user's guess for a match.

3. `GameHelper`: This class assists with user input and the placement of battleships on the game grid.

## How to Run the Code

1. Make sure you have Java installed on your system.
2. Compile all the `.java` files using the command: `javac *.java`
3. Run the Battleship game using the command: `java BattleshipGame`

## Gameplay

1. The game will welcome you and set up battleships.
2. Enter your guesses in the format like `a0`, `b3`, etc.
3. The game will inform you if you hit or miss a battleship, or if you sunk a battleship.
4. Keep guessing until you sink all battleships!

## Project Structure

- `BattleshipGame.java`: Manages the game's flow.
- `Battleship.java`: Represents the battleship objects.
- `GameHelper.java`: Assists with user input and battleship placement.
