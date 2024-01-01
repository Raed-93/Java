public class Testitem {
    public static void main(String[] args) {
        Item item1 = new Item("drip coffee",2);
        Item item2 = new Item("capuccino",4);
        Item item3 = new Item("mocha",7);
        Item item4 = new Item("Tea",5);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Raed");
        Order order4 = new Order("Ahmad");
        Order order5 = new Order("Mohamad");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item3);
        order3.addItem(item1);

        order4.addItem(item4);
        order4.addItem(item2);

        order5.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);

        System.out.println(order5.getStatusMessage());
        order5.setready(true);
        System.out.println(order5.getStatusMessage());

        System.out.println(order5.getOrderTotal());
        order5.display();


    }
    
}
