
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type a number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        System.out.println("The bigger number of the two numbers given was: " + Math.max(numberOne, numberTwo));
        
    }
}
