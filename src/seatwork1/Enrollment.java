package seatwork1;

import java.util.Scanner;

public class Enrollment {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student stud1 = new Student("Ruffa Resentes");

        System.out.println("Enter baon:");               
        stud1.setBaon(scan.nextDouble()); scan.nextLine(); 

        System.out.println("Enter new Name: ");
        stud1.setFullname(scan.nextLine());

        //display fullname and baon of the student
        System.out.println("FullName of student 1: " + stud1.getFullname());
        System.out.println("Baon: " + stud1.getBaon());

        Student stud2 = new Student("Rhea Reyes");
        stud2.setBaon(500);
        double totalBaon = stud2.getBaon() + 100;
        stud2.setBaon(totalBaon);
        System.out.println("FullName of student 1: " + stud2.getFullname());
        System.out.println("Baon: " + stud2.getBaon()); 
    }
}
