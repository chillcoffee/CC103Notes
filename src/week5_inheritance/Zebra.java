package week5_inheritance;

//public class Subclass extends Superclass
public class Zebra extends Animal{
    private boolean is_wild;

    public Zebra() {
    }

    public Zebra(int age, String gender) {
        super(age, gender); //call the constructor of the superclass
    }

    
    public void run(){
        System.out.println("Run kokoy run.");
    }
}
