public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
        int i = 0;
        
        while(i < amount){
        System.out.print("*");
        i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        
        int i = 0;
        
        while (i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {

        int i = 1;

        while (i <= size){
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        
        int i = 0;
        int j = 1;
        
        while (i < height){
            i++;
            printWhitespaces(height-i);
            printStars(j);
            j += 2;
        }
        
        int l = 0;
        
        while(l < 2){
            printWhitespaces(height-2);
            printStars(3);
            l++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
