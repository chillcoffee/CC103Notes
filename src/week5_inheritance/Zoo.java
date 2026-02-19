package week5_inheritance;
public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal(2, "male");
        dog.setAge(23);
        System.out.println(dog.getAge());
        
        Zebra kokoy = new Zebra();
        kokoy.setAge(12);
        kokoy.setGender("female");
        
        Zebra berta = new Zebra(5,"female");
        
        System.out.println("Kokoy is "+kokoy.getAge()+" years old and she is "+kokoy.getGender()+".");
        kokoy.run();
        
    }

}
