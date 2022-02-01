import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        boolean gameContinue = true;
        while (gameContinue) {
            System.out.println("Enter your guess:");
            int guess = scan.nextInt();
            if (guess < randomNumber){
                System.out.println("You have guessed a small number.");
            }
            else if (guess > randomNumber){
                System.out.println("You have guessed a large number.");
            }
            else {
                System.out.println("You've guessed it right!");
                gameContinue = false;
            }
        }


    }
}
