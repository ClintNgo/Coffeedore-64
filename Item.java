public class Item {
    private String name;
    private double price;
    private int items;

    public Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getItemName() {
        return this.name;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public double getItemPrice() {
        return this.price;
    }

    public void setItemPrice(double price) {
        this.price = price;
    }

    public void setItem(int item) {
        this.items = item;
    }

    public int getItem() {
        return this.items;
    }
}
