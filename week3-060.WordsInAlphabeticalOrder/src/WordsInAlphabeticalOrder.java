
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        String helper;
        
        while (true){
            System.out.print("Type a word: ");
            helper = reader.nextLine();
                if(helper.isEmpty()){
                    break;
                }
            list.add(helper);
            
        }
        
        Collections.sort(list);
        
        for(String word : list){
            System.out.println(word);
        }
    }
}
