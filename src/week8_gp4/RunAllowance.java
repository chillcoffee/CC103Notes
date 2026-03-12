package week8_gp4;
public class RunAllowance {
    public static void main(String[] args) {
        Allowance all = new Allowance("Ruffa Resentes",150);
        System.out.println(all.getName());
        double allowanceFor4Years = all.calcSem() * 8;
        System.out.println("Per semester: "+all.calcSem());
        System.out.println("Allowance for four years: "+allowanceFor4Years);
    }

}
