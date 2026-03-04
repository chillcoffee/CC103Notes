package week6_inheritanceIST;

public class Animal {

    public int age;
    public String gender;
    
    public Animal(){}

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public void isMammal() {
        //codes
    }

    public void eat() {
        System.out.println("Animal is eatting...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
