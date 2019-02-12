import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for(int number : list){
            sum = sum + number;
        }
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
      
        double counter = 0;
      
        for(int number : list){
            counter++;
        }
        
        return sum(list)/counter;
    }

    public static double variance(ArrayList<Integer> list) {
        
        double average = average(list);
        double helper = 0;
        double variance;
        
        for(int i : list){
        helper += Math.pow((i - average), 2);
        }
        
        variance = helper / (list.size()-1);
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
