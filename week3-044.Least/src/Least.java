
public class Least {

    public static int least(int number1, int number2) {

        int least;
        
        if(number1 < number2){
            least = number1;
        }
        else{
            least = number2;
        }
        
        return least;
    }

    public static void main(String[] args) {
        int result = least(3, 7);
        System.out.println("Least: " + result);
    }
}
