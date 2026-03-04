package week6_inheritanceIST;
public class Zoo {
    public static void main(String[] args) {
        Fish dory = new Fish("female", 5, 2, true);
        System.out.println("Age ni Dory: "+dory.getAge());
        dory.eat();
    }
}
























/*
Animal pet = new Animal(2, "male");
        System.out.println("Age: "+pet.getAge());
        
        Zebra petra = new Zebra(3, "female");        
        System.out.println("Age ni Petra: "+petra.getAge());
        Zebra pedro = new Zebra(4, "male", true);
        System.out.println("Age ni Petra: "+pedro.getAge());
        pedro.run();
*/