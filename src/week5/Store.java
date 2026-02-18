package week5;
public class Store {
    private String owner;
    private float cash;
    private float sales;

    public Store(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }
    
    //method
    public float sell(float price, float bayad){
        float sukli = bayad - price;
        return sukli;
    }
}
