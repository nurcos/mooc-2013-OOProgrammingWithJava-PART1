import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        
        int answer = keyboard.nextInt();
        Grade grade = new Grade();
        
        while(answer != -1){
           grade.addGrade(answer);
           answer = keyboard.nextInt();
        }
        
        System.out.println();
        
        grade.printGrades();
        
        grade.printGradeDistribution();
        
    }
}
