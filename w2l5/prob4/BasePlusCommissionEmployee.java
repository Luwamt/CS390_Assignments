package w1l2.CS390_Assignments.w2l5.prob4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
private double baseSalary;

public BasePlusCommissionEmployee(double baseSalary,String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate){
    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
this.baseSalary=baseSalary;
}
@Override
    public double getPayment(){
    return 0;
}
}
