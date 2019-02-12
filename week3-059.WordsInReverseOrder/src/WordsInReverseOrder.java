import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        String helper;
        
        while(true){
        System.out.print("Type a word: ");
        helper = reader.nextLine();
        list.add(helper);
            if(helper.isEmpty()){
                break;
            }
        }
        
        Collections.reverse(list);
        
        for (String word : list){
            System.out.println(word);
        }
    }
}
