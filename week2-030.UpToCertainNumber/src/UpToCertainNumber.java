
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        
        int count = 0;
        
        while(count < number){
            count++;
            System.out.println(count);
        }
        
    }
}
