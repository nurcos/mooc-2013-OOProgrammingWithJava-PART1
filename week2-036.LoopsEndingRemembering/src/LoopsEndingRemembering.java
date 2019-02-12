import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        
        int number = 0, sum = 0, count = -1; int even = -1; int odd = 0;
        
        while (number != -1){
            System.out.print("Type numbers: ");
            sum += number;
            if((number % 2) == 0){
                even++;
            }
            else{
                odd++;
            }
            number = Integer.parseInt(reader.nextLine());
            count++;
        }
        
        double average = (double)sum / (double)count;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
