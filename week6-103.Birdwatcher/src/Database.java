import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Bird> birds;
    
    public Database(){
        this.birds = new ArrayList<Bird>();
    }
    
    public void Add(Bird bird){
        birds.add(bird);
        
    }
    
    public void Observation(String obs){
        for(Bird bird : birds){
            if(bird.getName().equalsIgnoreCase(obs)){
                bird.Observed();
            }
            else{
                System.out.println("Is not a bird!");
            }
        }
        
    }
    
    public void Statistics(){
        for(Bird bird : birds){
            System.out.println(bird.toString());
        }
    }
    
    public void Show(String search){
        for(Bird bird : birds){
            if(bird.getName().equalsIgnoreCase(search)){
                System.out.println(bird.toString());
            }
            else{
                System.out.println("Is not in the database");
            }
        }
    }
}
