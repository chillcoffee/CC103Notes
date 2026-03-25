package week10_HN;

import java.util.InputMismatchException;
import java.util.Scanner;

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
            input = s.nextLine(); //"12.0"
            int next = Integer.parseInt(input);
            int sum = number / next;
            System.out.println("Result: " + sum);
        } catch(NumberFormatException e){
            System.out.println("ang error formatting.try again");
            attempt++;
            if(attempt < 3){
                System.out.println("Sorry wrong input.Please try again.");
                run();
            }
        } 
        catch (ArithmeticException e) {
            System.out.println("Sorry. Please enter a whole number number \ngreater than 0 as second number.");
        } catch (InputMismatchException e) {
            attempt++;
            if(attempt < 3){
                System.out.println("Sorry wrong input.Please try again.");
                run();
            }
                
        } finally {
            System.out.println("Thank you.");
        }
    }

}
