package week5;
public class Bakery {
    private String owner;
    private float price;
    private float sales;

    public Bakery(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }
    
    public static void main(String[] args) {
        
    }
    
    public float sell(int price, float bayad) {
        float sukli = bayad - price;
        return sukli;
    }

    public float sell(float price, int qty, float bayad) {
        float sukli = bayad - (price * qty);
        return sukli;
    }

}
