public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    public void update(double price) {
        System.out.println("WebApp - " + user + ": Stock price updated to ₹" + price);
    }
}
