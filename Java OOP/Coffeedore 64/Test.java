public class Test {
    public static void main(String[] args) {
        CoffeeKiosk coffee = new CoffeeKiosk();

        coffee.addMenuItem("banana", 2.00);
        coffee.addMenuItem("coffee", 1.50);
        coffee.addMenuItem("Latte", 4.50);
        coffee.addMenuItem("capuccino", 3.00);
        coffee.addMenuItem("muffin", 4.00);

        coffee.newOrder();
    }
    
}
