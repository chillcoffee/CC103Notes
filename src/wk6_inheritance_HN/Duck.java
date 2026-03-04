package wk6_inheritance_HN;
public class Duck extends Animal{
    public String beakColor;

    public Duck(String beakColor){
        this.beakColor = beakColor;
    }
    
    public Duck(String beakColor, int age){
        super(age, null);
        this.beakColor = beakColor;
    }
    
    
    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }

    public void swim(){
        System.out.println("Duck is swimming...");
    }
    
    public void quack(){
        System.out.println("Quak, kwak, kwak!!");
    }
}
