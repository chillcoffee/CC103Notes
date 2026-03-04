package week6_inheritanceIST;

public class Fish extends Animal {

    private int sizeInFt;
    private boolean canEat;

    public Fish(String gender, int age) {
        super(age, gender);

    }

    public Fish(String gender, int age, int sizeInFt, boolean canEat) {
        super(age, gender);
        this.sizeInFt = sizeInFt;
        this.canEat = canEat;

    }

    public int getSizeInFt() {
        return sizeInFt;
    }

    public void setSizeInFt(int sizeInFt) {
        this.sizeInFt = sizeInFt;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    private void swim() {
        System.out.println("Fish is swimming...");
    }

}
