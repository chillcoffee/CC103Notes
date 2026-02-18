package gp2;
public class RunStore {
    public static void main(String[] args) {
        //instantiate Store
        Store str = new Store("Aling Nena");
        Store st = new Store("Aling Susan");
        str.setOwner("Aling Susan");
        //call the both methods
        System.out.println("May bumili ng 1pc coke litro.");
        System.out.println("Sukli first customer: "+str.sell(35, 100));

        str.sell(35, 100, 2);   //method call obj
        
        
        //display total sales of Store
        System.out.println("\nTotal sales: "+str.getSales());
    }
}
