package week6_inheritance_HN;

public class Zebra extends Animal {

    private boolean isWild;

    public Zebra(int age, String gender) {
        super(age, gender);     //invoke the constructor of the parent class  
    }
    
    public Zebra(int age, String gender, boolean isWild) {
        super(age, gender);     //invoke the constructor of the parent class  
        this.isWild = isWild;
    }

    
    

    public void setIsWild(boolean isWild) {
        this.isWild = isWild;
    }

    public boolean isIsWild() {
        return isWild;
    }

    public void run() {
        System.out.println("Zebra is running...");
    }

}
