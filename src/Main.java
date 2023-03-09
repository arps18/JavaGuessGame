import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Welcome to Random Guess Game :)");
    System.out.println("Please enter your name: " );


    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    System.out.println("Hello " + name);

    System.out.println("Shall we start the game?");

    System.out.println("\t 1. Yes ");
    System.out.println("\t 2. No ");

    int beginAnswer = scanner.nextInt();

    while (beginAnswer != 1){
      System.out.println("Shall we start the game?");

      System.out.println("\t 1. Yes ");
      System.out.println("\t 2. No ");

      beginAnswer = scanner.nextInt();
    }

    Random random = new Random();
    int x = random.nextInt(20);

    System.out.println("Please guess a Number from 1-20: ");

    int userInput = scanner.nextInt();

    int counter = 0;
    boolean hasWon = false;
    boolean finishGame = false;

    while (!finishGame){
      counter++;

      if (counter < 5){
          if(userInput == x){
            hasWon = true;
            finishGame = true;
          } else if (userInput > x) {
            System.out.println("Guess a Lower Number!");
            userInput = scanner.nextInt();
          }
          else {
            System.out.println("Guess a Higher Number!");
            userInput = scanner.nextInt();
          }
      }else {
        finishGame = true;
      }
    }

    if(hasWon){
      System.out.println("Congratulations on winning the game! You guessed in " + counter +
          " times!");
    }else {
      System.out.println("Game over! You lost the game! :(" );
      System.out.println("The number was " + x);
    }

  }

}