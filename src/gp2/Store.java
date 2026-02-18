package gp2;
public class Store {
    private String owner;
    private float sales, cash;

    public Store(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }
 
    public static void main(String[] args) {
        System.out.println("test");
    }
    
    //method for selling
    public float sell(float price, float payment){
        float change = payment - price;
        this.setSales(this.getSales() + price);
        return change;
    }
    
    //overload sell with quantity
    public float sell(float price, float payment, int qty){
        float change =  payment - (price * qty);
        this.setSales(this.getSales() + (price * qty));
        return change;
    }
}
