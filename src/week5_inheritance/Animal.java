package week5_inheritance;
public class Animal {
    public int age;
    public String gender;

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
    
    public void printAnimal(){
        System.out.println("printtttttttt");
    }

}
