package w1l2.CS390_Assignments.w2l5.prob4;

public class SalariesEmployee extends Employee {
    private double weeklySalary;

    public SalariesEmployee(double grossSales,String firstName, String lastName, String socialSecurityNumber){
     super(firstName,lastName,socialSecurityNumber);
     this.weeklySalary=weeklySalary;
    }
    @Override
    public double getPayment(){
        return weeklySalary;
    }
}
