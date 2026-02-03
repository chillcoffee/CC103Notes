package seatwork2;

import java.util.Scanner;

/*
Instantiate Student object and use
Scanner to ask input from to user.
 */
public class Student {

    private String name;
    private double baon;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      //instantiate scan obj
        System.out.println("test");
        
        //insantiate two Student objects
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.setName(stud1.askName());             //call the askName() method then set derecho

        System.out.print("Pila ing baon: ");
        double userBaon = scan.nextDouble();
        stud1.setBaon(userBaon);

        stud2.setName(stud2.askName());

        //display details of each student
        System.out.println("\n=========Display Details=============");
        System.out.println("Student 1 Name: " + stud1.getName());
        System.out.println(stud1.getName() + "'s baon: " + stud1.getBaon());

        System.out.println("Student 1 Name: " + stud2.getName());
        System.out.println(stud2.getName() + "'s baon: " + stud2.getBaon());

    }

    public String askName() {
        Scanner scan = new Scanner(System.in);      //naka power on lang within the askName() method
        System.out.print("Enter your name: ");
        String userInput = scan.nextLine();         //scan words from keyboard
        return userInput;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaon() {
        return baon;
    }

    public void setBaon(double baon) {
        this.baon = baon;
    }

}
