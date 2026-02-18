package week5;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store sari = new Store("Aling Nena");
        //prompt
        System.out.print("Oi pa enter initial cash: ");
        
        int cash = scan.nextInt(); scan.nextLine();
        sari.setCash(cash);
        
        System.out.println("Enter new store name: ");
        String newOwner = scan.nextLine();
        sari.setOwner(newOwner);
        
        System.out.println("Store Details");
        System.out.println("Owner: "+sari.getOwner());
        System.out.println("Cash: "+sari.getCash());  
    }
}
