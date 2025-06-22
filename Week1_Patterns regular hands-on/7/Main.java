public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileUser = new MobileApp("Aksa");
        Observer webUser = new WebApp("Mathew");

        market.register(mobileUser);
        market.register(webUser);

        market.setStockPrice(520.75);
        market.setStockPrice(531.20);
    }
}
