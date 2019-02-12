
public class StringUtils {
    
    public StringUtils(){
        
    }
    
    public static boolean included(String word, String searched){
        
        word.trim();
        word.toUpperCase();
        searched.trim();
        searched.toUpperCase();
        
        if(word.equals("") || searched.equals("")){
            return false;
        }
        
        if (word.contains(searched)){
            return true;
        }
        
        return false;
    }
}
