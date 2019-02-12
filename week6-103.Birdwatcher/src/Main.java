import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            Scanner keyboard = new Scanner(System.in);
            
            String answer = "";
            Database database = new Database();
            
            while(!answer.equalsIgnoreCase("Quit")){
                System.out.print("? ");
                answer = keyboard.nextLine();
                if(answer.equalsIgnoreCase("add")){
                    System.out.print("Name: ");
                    String name = keyboard.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = keyboard.nextLine();
                    Bird bird = new Bird(name, latinName);
                    database.Add(bird);
                }
                else if (answer.equalsIgnoreCase("observation")){
                    System.out.print ("What was observed? ");
                    database.Observation(keyboard.nextLine());
                }
                else if (answer.equalsIgnoreCase("statistics")){
                    database.Statistics();
                }
                else if (answer.equalsIgnoreCase("show")){
                    System.out.print("What? ");
                    String search = keyboard.nextLine();
                    database.Show(search);
                }
            }
    }

}
