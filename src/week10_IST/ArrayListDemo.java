package week10_IST;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList();
        
        Product p = new Product("asin");
        productList.add(p);       
        Product p1 = new Product("toyo");
        productList.add(p1);
        
        productList.add(new Product("paminta"));       


        for(Product prodObj: productList){
            System.out.println(prodObj.getProductName());
        }
    }

}
