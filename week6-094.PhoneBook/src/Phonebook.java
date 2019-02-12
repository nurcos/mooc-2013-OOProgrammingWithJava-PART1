import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> list = new ArrayList<Person>();
    
    public void add(String name, String number){
        Person newPerson = new Person(name, number);
        list.add(newPerson);
    }
    
    public void printAll(){
        for (Person person : list){
            String each = person.toString();
            System.out.println(each);
        }
        
    }
    
    public String searchNumber(String name){
        
        for(Person person : list){
            if(person.getName().equals(name)){
            return person.getNumber();
            }
        }
        
        return "number not known";
    }
}
