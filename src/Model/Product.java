package Model;

public class Product {
    private int product_id;
    private String name;
    private String category;
    private int price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getProduct_id() {
        return product_id;
    }
    public String getCategory() {
        return category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
}
