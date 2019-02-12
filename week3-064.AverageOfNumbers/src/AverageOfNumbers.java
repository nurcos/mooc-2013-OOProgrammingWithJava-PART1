
import java.util.ArrayList;

public class AverageOfNumbers {

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int number : list){
            sum = sum + number;
        }
        
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
      
        double counter = 0;
      
        for(int number : list){
            counter++;
        }
        
        return sum(list)/counter;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
