
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int greatest;
        
        if(number1 > number2 && number1 > number3){
            greatest = number1;
        }
        else if(number2 > number1 && number2 > number3){
            greatest = number2;
        }
        else{
            greatest = number3;
        }
        
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(10, 10, 11);
        System.out.println("Greatest: " + result);
    }
}
