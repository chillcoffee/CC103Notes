package gp2;
public class Pastilan {
    public static void main(String[] args) {

        //instantiate Pastil obj
        Pastil past = new Pastil("Aling Lourdes");
        
        float sukli = past.sell(25, 100);        
        System.out.println("Sukli ng first customer: "+sukli);
        
        //another call with 3 params (25, 100, 2)
        sukli = past.sell(25, 100, 2);        
        System.out.println("Sukli ni 2nd cust: "+sukli);
        
        //output totalSales
        System.out.println("Total Sales: "+past.getSales());
    }

}
