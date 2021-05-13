/*
* This program allows the user to play rock paper scissors against the computer.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-05
*/

import java.util.Random;  // Import the Random class
import java.util.Scanner;  // Import the Scanner class

public final class RockPaperScissors {
    private RockPaperScissors() {
  }
  /**
  * the number three.
  */
  public static final int THREE = 3;
  /**
   * This program allows the user to play rock paper
   * scissors against the computer.
   * @param args
   */
  public static void main(final String[] args) {
    try {
      // User input for rock paper or scissors
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter Rock, Paper or Scissors: ");
      String userMoveChosenLowerCase = userInput.nextLine();
      String userMoveChosen = userMoveChosenLowerCase.toUpperCase();
      System.out.println();

      // Initializing the random class
      Random randomNumber = new Random();

      // Generating rock paper or scissors for the computer
      String computerMoveChosen = "Unknown";
      int moveNumber = randomNumber.nextInt(THREE) + 1;
      if (moveNumber == 1) {
        // The computer chooses rock
        computerMoveChosen = "Rock";
        System.out.println("The Computer Chose Rock");
      } else if (moveNumber == 2) {
        // The computer chooses paper
        computerMoveChosen = "Paper";
        System.out.println("The Computer Chose Paper");
      } else if (moveNumber == THREE) {
        // The computer chooses scissors
        computerMoveChosen = "Scissors";
        System.out.println("The Computer Chose Scissors");
      } else {
        // The computer is unable to properly choose a move
        System.out.println("ERROR: Program Unable to Select Move");
      }

      // Process and Outputs
      if (userMoveChosen.equalsIgnoreCase(computerMoveChosen)) {
        // Output if a tie occurs
        System.out.println("It's a tie!");
      } else if (userMoveChosen.equals("ROCK")
                 && computerMoveChosen.equals("Scissors")) {
        // Output if the user wins with rock over scissors
        System.out.println("You Win!");
      } else if (userMoveChosen.equals("PAPER")
                 && computerMoveChosen.equals("Rock")) {
        // Output if the user wins with paper over rock
        System.out.println("You Win!");
      } else if (userMoveChosen.equals("SCISSORS")
                 && computerMoveChosen.equals("Paper")) {
        // Output if the user wins with scissors over paper
        System.out.println("You Win!");
      } else if (userMoveChosen.equals("ROCK")
                 && computerMoveChosen.equals("Paper")) {
        // Output if the computer wins with paper over rock
        System.out.println("You Lost. Try Again!");
      } else if (userMoveChosen.equals("PAPER")
                 && computerMoveChosen.equals("Scissors")) {
        // Output if the computer wins with scissors over paper
        System.out.println("You Lost. Try Again!");
      } else if (userMoveChosen.equals("SCISSORS")
                 && computerMoveChosen.equals("Rock")) {
        // Output if the computer wins with rock over scissors
        System.out.println("You Lost. Try Again!");
      } else {
        // The program is unable to determine a winner
        System.out.println("ERROR: Invalid Input");
      }

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
