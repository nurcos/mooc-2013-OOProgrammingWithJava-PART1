
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        
        Account ryansAccount = new Account("Ryan's Account", 100);
        
        ryansAccount.deposit(20);
        
        System.out.println(ryansAccount);
    }

}
