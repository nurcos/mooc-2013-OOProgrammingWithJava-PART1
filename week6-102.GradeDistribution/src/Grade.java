import java.util.ArrayList;

public class Grade {
    
    private ArrayList<Integer> grades;
    
    public Grade(){
        this.grades = new ArrayList<Integer>();
    }
    
    public void addGrade(int grade){
        if (grade >= -1 && grade <=60){
        this.grades.add(grade);
        }
    }
    
    public void printGrades(){
        for(int grade : grades){
            System.out.println(grade);
        }
        System.out.println();
    }
    
    public void printStar(int amount){
        System.out.print("*");
    }
    
    public void printGradeDistribution(){
        int failed = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        
        for(int grade : grades){
            if (grade <= 29){
                failed++;
            }
            else if(grade >= 30 && grade <= 34){
                one++;
            }
            else if(grade >= 35 && grade <= 39){
                two++;
            }
            else if(grade >= 40 && grade <= 44){
                three++;
            }
            else if(grade >= 45 && grade <= 49){
                four++;
            }
            else if(grade >= 50 && grade <= 60){
                five++;
            }
        }
        System.out.println("Grade Distribution:");
        System.out.println("5" + printStar(one));
        System.out.println("4");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("0");
        
        System.out.println("Acceptance percentage: ");
        
        
        System.out.println();
    }
    
}
