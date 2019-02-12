
public class Main {

    public static void main(String[] args) {
        NightSky test = new NightSky(0.2, 20, 10);
        test.print();
        System.out.println("");
        System.out.println("Stars in last print: " + test.starsInLastPrint());
    }
}
