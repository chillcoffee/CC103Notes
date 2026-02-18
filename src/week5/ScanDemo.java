package week5;

import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {
        //instantiate
        Scanner sc = new Scanner(System.in);
        //prompt
        System.out.println("Enter number pod: ");
        //scan and save
        int num = sc.nextInt();
        float money = sc.nextFloat(); sc.nextLine();
        System.out.println("Money: "+money);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: "+name);
        
        Store str = new Store(name);    //instantiate Store obj using the user input name
        System.out.println(str.getOwner());
        
        
    }

}
