package gp2;

public class Student {

    private String name;
    private int subjects;
    private float tuition;
    
    //constructor, setter, getter, 
    //2 calcTuition methods

    public Student(String name, int subjects, float tuition) {
        this.name = name;
        this.subjects = subjects;
        this.tuition = tuition;
    }

    public double calculateTuition(int subjects){
        double totalTuition = (double) subjects * 1200;
        return totalTuition;
    }
    //another overlaoded calculateTution here
}
