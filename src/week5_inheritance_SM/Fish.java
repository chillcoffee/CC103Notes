package week5_inheritance_SM;
public class Fish extends Animal{
    
    public Fish(){
        
    }
    
    public Fish(int age, String gender){
        super(age, gender);
    }
    
    public void fishprint(){
        super.printAnimal();
    }

}
