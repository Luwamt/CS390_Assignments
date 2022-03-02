package w1l2.CS390_Assignments.w2l5.prob4;

public class CommissionEmployee  extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales* commissionRate;
    }
}
