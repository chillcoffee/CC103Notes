package wk6_inheritance_HN;
public class Animal {
    private int age;
    private String gender;
    
    public Animal(){
    }

    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
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
        
    public void isMammal(){
        System.out.println("Animal is mammal.");
    }
    
    public void mate(){
        //
    }
}
