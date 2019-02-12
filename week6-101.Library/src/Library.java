import java.util.ArrayList;

public class Library {
    private ArrayList<Book> list = new ArrayList<Book>();
    
    public Library(){
        
    }
    
    public void addBook(Book newBook){
        list.add(newBook);
    }
    
    public void printBooks(){
        for(Book book : list){
            String helper = book.toString();
            System.out.println(helper);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
             
        for(Book book : list){
            String helper = book.title();
            if (helper.contains(title)){
                found.add(book);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
             
        for(Book book : list){
            String helper = book.publisher();
            if (helper.contains(publisher)){
                found.add(book);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        String yearToString = "";
        yearToString += year;
        String helper = "";
        
        for(Book book : list){
            helper += book.year();
            if (helper.contains(yearToString)){
                found.add(book);
            }
        }
        
        return found;
    }
}
