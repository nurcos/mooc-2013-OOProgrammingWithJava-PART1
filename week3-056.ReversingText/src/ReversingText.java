
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
        String finalWord = "";
        int i = text.length();
        char helper;
        
        while(i > 0){
            helper = text.charAt(i-1);
            finalWord = finalWord + helper;
            i--;
        }
        
        return finalWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}