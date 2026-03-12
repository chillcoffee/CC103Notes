
package week8_gp4;


public interface AllowanceCalculator {
    public double calcDaily();
    public double calcWeekly();
    public double calcMonthly();
    public double calcSem(int month, double monthlyAllowance);
    
}
