package w1l2.CS390_Assignments.w2l5.prob2;

import java.time.LocalDate;

public class Professors extends DeptEmployee{
    private int numberOfPublications;

    public Professors(String name, double salary, LocalDate hireDate,int numberOfPublications) {
        super(name, salary, hireDate);
        this.numberOfPublications=numberOfPublications;
    }


    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
