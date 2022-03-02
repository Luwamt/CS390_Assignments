package w1l2.CS390_Assignments.w2l5.prob4;

public class MainDriveEmployee {
    public static void main(String[] args) {
Employee emp1= new CommissionEmployee("luwam","haile","1234",120.25,1.50);
Employee emp2= new BasePlusCommissionEmployee(2000,"Mercy","Fish","4567",200,1.0);
Employee emp3=new HourlyEmployee("Filmon","Arkan","85236",1500,8);
Employee emp4 =new SalariesEmployee(500,"Yosam","Habte","14796");
Employee emp5=new SalariesEmployee(100,"Rahwa","Fili","85632");

Employee[] employees= {emp1, emp2,emp3,emp4,emp5};
        System.out.println();
double salaries=0;
        for (Employee result: employees) {
           salaries+=result.getPayment();
        }
        System.out.println("The Total Salaries of the employees: $"+salaries);
        System.out.println();
        System.out.println("+++++++++++++To Print all the Employees+++++++++++++");
    for(Employee print : employees) {
        System.out.println(print);
    }
}
}
