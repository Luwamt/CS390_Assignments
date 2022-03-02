package w1l2.CS390_Assignments.w2l5.prob2;

import java.time.LocalDate;

public class Secretaries extends DeptEmployee{
    private double overtimeHours;

    public Secretaries(String name, double salary, LocalDate hireDate,double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours=overtimeHours;
    }


    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        double sum= super.computeSalary()+ (12* (overtimeHours));
        return sum;
    }
}
