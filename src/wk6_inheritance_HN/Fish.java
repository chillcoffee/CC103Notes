package wk6_inheritance_HN;

public class Fish extends Animal {

    private int sizeinFt;
    private boolean canEat;

    public Fish(int size, String gender, int age) {
        super(age, gender);
        this.sizeinFt = size;
    }

    public int getSizeinFt() {
        return sizeinFt;
    }

    public void setSizeinFt(int sizeinFt) {
        this.sizeinFt = sizeinFt;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    public void swim() {
        System.out.println("Fish is swimming...");
        super.isMammal(); //call parent's method
    }

}
