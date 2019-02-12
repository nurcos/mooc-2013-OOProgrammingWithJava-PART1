
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int guesses = 0;
        
        while(guess != numberDrawn){
            
            guesses++;
            
            if(guess < numberDrawn){
            
                System.out.println("The number is greater, guesses made: " + guesses);
            }
            else{
                System.out.println("The number is lesser, guesses made: " + guesses);
            }

        guess = Integer.parseInt(reader.nextLine());
            
        }
        
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
