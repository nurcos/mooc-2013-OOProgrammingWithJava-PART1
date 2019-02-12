
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.print("studentnumber: ");
            Student student = new Student(name, reader.nextLine());
            list.add(student);
        }
        
        for(Student students : list){
            System.out.println(students);
        }
        
        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result");
        for(Student students : list){
            String name = students.getName();
            if(name.contains(search)){
                System.out.println(students);
            }
        }
    }
}
