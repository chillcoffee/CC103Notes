package week9_FileException;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemManager {
    
    public void setPriceForAll(ArrayList<Product> productList){
        System.out.println("\nPrice management: ");
        Scanner s = new Scanner(System.in);
        for(Product p: productList){
            System.out.print("Enter price for "+p.getProductName()+": ");
            double priceEntered = s.nextDouble();
            p.setPrice(priceEntered);
        }
    }
}
