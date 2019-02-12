
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int numberEntered = Integer.parseInt(reader.nextLine());
        
        int count = 0;
        int sum = 0;
        
        while(count < numberEntered){
            int power = (int)Math.pow(numberEntered, count);
            count++;
        }

    }
}
