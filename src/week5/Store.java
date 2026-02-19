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
    public static float sell(float price, float bayad){
        float sukli = bayad - price;
        return sukli;
    }
    
    public float purchase(float price, float bayad){
        float sukli = bayad - price;
        return sukli;
    }
    
    public static void main(String[] args) {
        //obj.methodName
        Store mall = new Store("Aling Lourdes");
        mall.purchase(500, 100);
        sell(25,50);
        System.out.println("Eto yung main ng Store class.");
    }
}
