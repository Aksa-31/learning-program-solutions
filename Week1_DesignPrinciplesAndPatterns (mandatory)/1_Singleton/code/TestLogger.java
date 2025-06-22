public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Hello from logger1");
        logger2.log("Hello from logger2");

        if (logger1 == logger2) {
            System.out.println("Same instance confirmed!");
        } else {
            System.out.println("Different instances - Singleton FAILED!");
        }
    }
}
