import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] values = {6, 33, -1, 2, 8};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 3));
        }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for(int i = 0; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
            
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        
        int smallest = smallest(array);
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] == smallest){
                answer = i;
            }
        }
        
        return answer;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        
        int smallestNumber = array[index];
        int smallestIndex = index;
        
        for(int i = index; i < array.length; i++){
            if(array[i] < smallestNumber){
                smallestNumber = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int intOne = array[index1];
        int intTwo = array[index2];
        
        array[index1] = intTwo;
        array[index2] = intOne;
        
    }
    
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            if(indexOfTheSmallestStartingFrom(array, i) > i){
                swap(array, indexOfTheSmallestStartingFrom(array, i), i);
            }
        }
    }

}
