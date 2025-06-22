public class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    public void update(double price) {
        System.out.println("MobileApp - " + user + ": Stock price updated to ₹" + price);
    }
}
