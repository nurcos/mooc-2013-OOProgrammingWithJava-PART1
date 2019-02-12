import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        Random draw = new Random();
        int number = draw.nextInt(39)+1;
        int i = 0;
        // Write the number drawing here using the method containsNumber()
        while(i < 7){
        if(!containsNumber(number)){
            numbers.add(number);
        }
        else{
            i--;
        }
        number = draw.nextInt(39)+1;
        i++;
        }
        Collections.sort(numbers);

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (numbers.contains(number)){
        return true;
        }
        else{
            return false;
        }
    }
}
