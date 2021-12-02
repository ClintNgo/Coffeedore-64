public class TestOrders {

    public static void main(String[] args) {

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        
        coffeeKiosk.addMenuItem("Banana", 2);
        coffeeKiosk.addMenuItem("Cofee", 1.5);
        coffeeKiosk.addMenuItem("Latte", 4.5);
        coffeeKiosk.addMenuItem("Cappuchino", 3);
        coffeeKiosk.addMenuItem("Muffin", 4);
    
        coffeeKiosk.addMenuItemByInput();
        coffeeKiosk.newOrder();
    }
}