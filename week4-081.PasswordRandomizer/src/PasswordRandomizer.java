import java.util.Random;

public class PasswordRandomizer {
    private int passwordLength;
    Random randomizer = new Random();

    public PasswordRandomizer(int length) {
        this.passwordLength = length;
        
    }

    public String createPassword() {
        int i = 0;
        String password = "";
        
        while( passwordLength > i ){
            i++;
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomizer.nextInt(26));
            password += symbol;
            
        }
        return password;
    }
}
