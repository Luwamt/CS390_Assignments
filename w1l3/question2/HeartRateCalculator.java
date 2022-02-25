package w1l2.CS390_Assignments.w1l3.question2;

import w1l2.CS390_Assignments.w1l3.question2.HeartRates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HeartRateCalculator {


    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, Enter your firstName");
         String firstName = scan.nextLine();
        System.out.println("Please, Enter your lastName");
        String lastName = scan.nextLine();
        System.out.println("Please Enter your birth date in the format -(yyyy-mm-dd) - Example 1989-4-14");
        String birthYear = scan.nextLine();

        d = LocalDate.parse(birthYear, formatter);
        HeartRates ht = new HeartRates(firstName,lastName,d);

        System.out.println(ht.targetHeartRateRange());
        System.out.println(ht);




//        System.out.println(ht.targetHeartRateRange());
//        System.out.println("First Name: "+ht.getFirstName());
//        System.out.println("Last Name: "+ht.getLastName());
//        System.out.println("Age: "+ht.personAge());
//        System.out.println("Date of Birth: "+ht.getBirth());
//        System.out.println("Maximum Heart Rate:"+ht.maxHeartRate());


    }


    }


