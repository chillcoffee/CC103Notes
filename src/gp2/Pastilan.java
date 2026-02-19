package gp2;
public class Pastilan {
    public static void main(String[] args) {

        //instantiate Pastil obj
        Pastil past = new Pastil("Aling Lourdes");
        Pastil pastil = new Pastil("Aling Nena");
        
        float sukli = past.sell(100, 125);        
        System.out.println("Sukli ng first customer: "+sukli);
        pastil.setPrice(10);
        System.out.println("Price of Pastil: "+pastil.getPrice());
        pastil.setPrice(20);
        System.out.println("New Price of Pastil: "+pastil.getPrice());
        
        //another call with 3 params (25, 100, 2)
        sukli = past.sell(25, 100, 2);        
        System.out.println("Sukli ni 2nd cust: "+sukli);
        
        //output totalSales
        System.out.println("Total Sales: "+past.getSales());
        System.out.println(past.getOwner());
        System.out.println(pastil.getOwner());
    }

}
