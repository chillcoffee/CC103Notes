package week5;
public class StaticMethodsDemo {
    
    public static void main(String[] args) {
        System.out.println("test");
        //static methods = methods that belong to the class, not the obj
        Store sari = new Store("Aling Lourdes");
        Store mall = new Store("Aling Lourdes");
        
        String formatted = String.format("%.3f", 3.141612654);
        System.out.println("Formatted pi: "+formatted);
        
        System.out.println("Sukli: "+String.format("%.2f", sari.purchase(500, 1000)));
        Store.sell(25.0f, 100.0f);
        
        
    }

}
