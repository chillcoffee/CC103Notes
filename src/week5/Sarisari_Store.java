package week5;

public class Sarisari_Store {

    public static void main(String[] args) {
        Sarisari_Store sr = new Sarisari_Store();
        //sr.printWelcome();
        sr.printWelcome("Ruffa");
        sr.printWelcome("Elsa");
        System.out.print("sukli ni Ruffa: " + sr.sell(35, 100));

        float sukliFromMethod = sr.sell(50, 1500);
        System.out.println("\n\nsukli ni Elsa: " + sukliFromMethod);

        Store str = new Store("Aling Nena");
        System.out.println("Sukli: " + str.sell(50, 100));

    }

    public void printWelcome(String name) {
        System.out.println("Welcome to my Store, " + name + "!");
    }

    public void printWelcome() {
        System.out.println("Generic Welcome");
    }

    public float sell(float price, float bayad) {
        float sukli = bayad - price;
        return sukli;
    }

    public float sell(float price, float bayad, int quantity) {
        float sukli = bayad - (price * quantity);
        return sukli;
    }
}
