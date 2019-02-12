
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        
        int numberEntered = Integer.parseInt(reader.nextLine());
        
        int count = 0;
        int plus = 1;
        
        while (numberEntered > plus-1){
            count = count + plus;
            plus++;
        }
        System.out.println(count);
    }
}
