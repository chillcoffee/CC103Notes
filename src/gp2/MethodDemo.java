package gp2;

public class MethodDemo {

    public static void main(String[] args) {
//        MethodDemo stud = new MethodDemo();
//        String binalik = stud.printName();
//        System.out.println(binalik);
//        System.out.println("Sum: "+stud.calcSum(3, 5));
//        int prevSum = stud.calcSum(13, 5);
//        int finalResult = stud.calcSum(prevSum, 15);
//        System.out.println("Previous sum + 15 is " +finalResult);
//        System.out.println(stud.calcSum(1, 2));
          printNumber();
    }
    
    public static void printNumber(){
        System.out.println("Nubmer is 3000");
    }

    public String printName() {
        System.out.println("Ruffa Resentes");
        System.out.println("Faculty");
        return "okay";
    }

    public int calcSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    } 
    
    public int calcSum(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    } 
   
}
