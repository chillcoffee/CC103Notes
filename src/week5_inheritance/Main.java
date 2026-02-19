package week5_inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bakery b = new Bakery("Ruffa");
        Scanner scan = new Scanner(System.in);
        b.setProductName("Spanish bread");
        b.setPrice(20);
        
        System.out.println("Ilang "+b.getProductName()+" bibilhin nyo? ");
        int qty = scan.nextInt();
        System.out.println("Magkano pera nyo po? ");
        float bayad = scan.nextFloat();
        float result = b.sell(bayad, b.getPrice() * qty);
        System.out.println("Sukli nyo: "+String.format("%.2f", result));
        
        System.out.println("\nTotal sales ng bakery ni "+b.getOwner()+": "+String.format("%.2f", b.getSales()));
    }
}
