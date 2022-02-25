package w1l2.CS390_Assignments.w1l3;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private  LocalDate birth;
    public static final double RHR=70;
    public static final double LB = 0.5;
    public static final double UB =0.85;
    public HeartRates(String firstName, String lastName,  LocalDate birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth( LocalDate birth) {
        this.birth = birth;
    }
    public int personAge(LocalDate dob) {
        LocalDate date = LocalDate.now();
        return  Period.between(dob,date).getYears();
        //int year = dob.getYear();
        // year - birth.getYear();
    }

    public int maxHeartRate(){

        return 220- personAge(birth);
    }
    public String targetHeartRateRange(){
        double mhr = maxHeartRate();
        double ahr = mhr-RHR;
        double lbthr=(ahr*LB)+RHR;
        double ubthr=(ahr* UB)+RHR;
        return ("The target Heart Rate Range is between " + lbthr + " and " + ubthr+"%");
    }
    @Override
    public String toString() {
       ;
        return "First Name: " + firstName + ", \nLast Name: " + lastName + ", \nAge: "
                + personAge(birth) + ", \nDate of Birth: " +getBirth()+
                ", \nMax Heart Rate: " + maxHeartRate() ;
    }

}

 /*public Period personAge(LocalDate givenBirthDate){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        return Period.between(b, now);
        *//*public Period calculateAge(){
            LocalDate  today = LocalDate.now();
            return Period.between(givenBirthDate, today);*/
