package week5_inheritance;

import java.util.Scanner;

public class Store {
    private String owner, productName;
    private float sales;
    
    public Store(){
        
    }
    public Store(String owner) {
        this.owner = owner;
    }
    //Create another class Bakery that is a child class of Store
    //Doon kayo magbenta sa bakery
    public static void main(String[] args) {
        Store s = new Store("Ruffa");
        Scanner scan = new Scanner(System.in);
        s.setProductName("bag");
        System.out.println("Ilang "+s.getProductName()+" bibilhin nyo? ");
        int qty = scan.nextInt();
        System.out.println("Magkano pera nyo po? ");
        float bayad = scan.nextFloat();
        float result = s.sell(bayad, 300 * qty);
        System.out.println("Sukli nyo: "+String.format("%.2f", result));
    }
    
    public float sell(float payment, float price){
        float change = payment - price;
        this.sales += price; 
        return change;
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }
}

//child class: Bakery
//parent Store
