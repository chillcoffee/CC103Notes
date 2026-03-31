package week10_HN;

import java.util.*;
import java.io.*;

public class ExceptionDemo {
    int attempt = 0;
    public static void main(String[] args) {
        ExceptionDemo app = new ExceptionDemo();
        app.run();
    }

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try {
            String input = s.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Enter second number: ");
            input = s.nextLine();
            int next = Integer.parseInt(input);
            int sum = number / next;
            System.out.println("Result: " + sum);
        } catch(NumberFormatException e){
            System.out.println("ang error formatting.try again");           
        }  catch (InputMismatchException e) {
            System.out.println("Maling data type.");
        } finally {
            System.out.println("Thank you.");
        }
    }

}
