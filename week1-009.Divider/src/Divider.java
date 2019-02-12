
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        double numberOne = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double numberTwo = Integer.parseInt(reader.nextLine());
        System.out.println("");
        System.out.println("Division: " + (int)numberOne + " / " + (int)numberTwo + " = " + (double)(numberOne / numberTwo));
    }
}
