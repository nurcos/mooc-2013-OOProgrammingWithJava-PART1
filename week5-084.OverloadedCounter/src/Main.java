public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(5, false);
        
        System.out.println(counter.value());
        
        counter.increase(-2);
        
        System.out.println(counter.value());

    }
}
