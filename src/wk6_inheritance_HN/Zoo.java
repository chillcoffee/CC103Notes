package wk6_inheritance_HN;

public class Zoo {

    public static void main(String[] args) {
        Zebra petra = new Zebra(3, "female");
        System.out.println("Age ni Petra: " + petra.getAge());

        Zebra pedro = new Zebra(3, "male", true);
        Fish dory = new Fish(1, "female", 3);
        System.out.println("Age ni Dory: " + dory.getAge());
        dory.swim();

        Duck amy = new Duck("yellow", 3);
        System.out.println(amy.getBeakColor());
        System.out.println("Age ni amy: " + amy.getAge());

    }
}
