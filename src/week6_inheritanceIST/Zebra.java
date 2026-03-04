package week6_inheritanceIST;
public class Zebra extends Animal{
    private boolean isWild;
    
    public Zebra(int age, String gender){
        super(age, gender); //call the constructor of parentClass
        
    }
    
    public Zebra(int age, String gender, boolean isWild){    
        super(age, gender);
        this.isWild = isWild;        
    }
    
    public void run(){
        System.out.println("Zebra is running...");
        super.eat();
    }
}
