package week5;

public class RunBakery {

    public static void main(String[] args) {

        Bakery bakery = new Bakery("Aling Lourdes");
        bakery.setPrice(20);
        System.out.println("Sukli: " + bakery.sell(2, 100));
        bakery.setSales(2 * 10);

        System.out.println("Sales: " + bakery.getSales());

    }

    public float sell(int qty, float bayad) {
        float sukli = bayad - (10 * qty);
        return sukli;
    }

    public float anotherMethod() {
        return 50 * 2;
    }

    //method to welcome customer
    public void welcome() {
        System.out.println("Welcome to my bakery!");
    }

    public void welcome(String name) {
        System.out.println("Welcome to my bakery, " + name + "!");
    }

}
