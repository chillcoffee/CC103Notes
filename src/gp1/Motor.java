package gp1;

public class Motor {
    //attributes
    String brand = "Honda";
    double price = 64000;
    
    //constructor
    public Motor(){
        /*
        codes here to initialize object
        */
    }
    
    public static void main(String[] args) {
        //instantiation = create object
        //Classname objectName = new Classname();
        Motor honda = new Motor();  //instantiation
        System.out.print("I will buy a "+honda.brand+" worth ");
        System.out.println(String.format("%.2f",honda.price)+" pesos.");
        honda.start();  //method call
    }
    
    //methods
    public void start(){
        System.out.println("Motor is starting...");
    }
    
}
