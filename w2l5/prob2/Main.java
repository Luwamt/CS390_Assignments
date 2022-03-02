package w1l2.CS390_Assignments.w2l5.prob2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DeptEmployee hana= new Professors("Hana",2000,LocalDate.of(2018,5,15),4);
        DeptEmployee letina= new Professors("Letina",12000,LocalDate.of(2020,9,30),5);
        DeptEmployee mercy= new Professors("Mercy",22000,LocalDate.of(2019,3,2),7);
        DeptEmployee abiel= new Secretaries("Abiel",32000,LocalDate.of(2000,1,1),5);
        DeptEmployee fikr= new Secretaries("Fikr",9000,LocalDate.of(2016,11,5),10);

        DeptEmployee[] empl= {hana,letina,mercy,abiel,fikr};

        System.out.println("Would you like to see the sum of salaries for Professor and Secretary");
        System.out.println("Type "+ "\"Y\" see the sum of salaries or \"N\" to Exit the program.");
        String sum = scan.nextLine();

        if(sum.equalsIgnoreCase("Y")){
            double salary = 0;
            for (int i = 0; i < empl.length; i++) {
                salary += empl[i].computeSalary();
            }
            System.out.println("The total sum of salaries are: $"+salary);
        }
       else {
            System.out.println("You have a good day!");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (DeptEmployee hireDat: empl) {
            System.out.println("The hire date for the "+hireDat.getClass().getSimpleName()+": "+ hireDat.getHireDate());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("The over time  salary for fikr: "+fikr.computeSalary());

    }

}

