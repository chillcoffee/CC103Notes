package week8_gp4;

public class Allowance extends Student implements AllowanceCalculator {

    private double money;    

    public Allowance(String name, double money) {
        super(name);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public double calcDaily() {
        double daily = money; //FORMULA DAPAT DA
        return daily;
    }

    @Override
    public double calcWeekly() {
        double weekly = calcDaily() * 5;
        return weekly;
    }

    @Override
    public double calcMonthly() {
        double monthly = calcWeekly() * 4;
        return monthly;
    }

    
    public double calcSem() {
        double monthly = calcMonthly() * 5;
        return monthly;
    }

    @Override
    public double calcSem(int month, double monthlyAllowance) {
        double monthly = calcMonthly() * month;
        return monthly;
    }

}
