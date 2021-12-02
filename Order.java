import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<String> items = new ArrayList<String>();

    public Order() {
        this.name = "guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    public String getOrderName() {
        return this.name;
    }

    public boolean getOrderReady() {
        return this.ready;
    }

    public ArrayList<String> getOrderItems() {
        return items;
    }

    public void setOrderName(String name) {
        this.name = name;
    }

    public void setOrderReady(boolean ready) {
        this.ready = ready;
    }

    public void setOrderItems(ArrayList<String> items) {
        this.items = items;
    }
    
    public void addItem(Item item) {
    
        this.items.addAll(items);
    }
    
    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        } else {
            return "Your order will be ready.";
        }
    }
}
