import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        
        int count = 0;
        int sum = 1;
        
        while(count < firstNumber){
            count++;
            sum *= count;
        }
        
        System.out.println("Factorial is " + sum);

    }
}
