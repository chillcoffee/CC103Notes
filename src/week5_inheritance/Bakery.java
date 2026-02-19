package week5_inheritance;
public class Bakery extends Store{
    private float price;
    
    public Bakery(String owner) {
        super(owner);
    }
    
    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
    
    
}
