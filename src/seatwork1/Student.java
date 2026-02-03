package seatwork1;

public class Student {

    private String fullname;
    private double baon;

    public Student(String fullname) {
        this.fullname = fullname;
    }

    public static void main(String[] args) {
        Student ako = new Student("Ruffa Resentes");
        System.out.println("sure guid ga run da");
        System.out.println("testing only");
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getBaon() {
        return baon;
    }

    public void setBaon(double baon) {
        this.baon = baon;
    }
    
}


