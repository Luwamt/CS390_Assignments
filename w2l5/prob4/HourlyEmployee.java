package w1l2.CS390_Assignments.w2l5.prob4;

public class HourlyEmployee extends Employee{
    private double wages;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double wages,double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wages=wages;
        this.hours=hours;
    }

    @Override
    public double getPayment() {
        return wages*hours;
    }
}
