import SingletonDesign.*;

public class Main {
    public static void main(String[] args) {
        // Logger log = new Logger()

        Logger log = Logger.getLogger();

        Logger log2 = Logger.getLogger();

        System.out.println(log);
        System.out.println(log2);
    }
}
