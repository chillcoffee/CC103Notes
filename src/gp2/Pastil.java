package gp2;
public class Pastil {
    private String owner;
    private float price, sales;

    public Pastil(String owner) {
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
    
    public float sell(float price, float payment){
        float change = payment - price;
        this.setSales(sales + price);   //change sales value kada benta
        return change;
    }
    
    //sell method with params: price, payment, quantity
    public float sell(float price, float payment, int quantity){
        float change = payment - (price * quantity);
        this.setSales(this.getSales() + (price * quantity));
        return change;
    }
}
