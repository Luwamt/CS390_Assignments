package w1l2.CS390_Assignments.hwsort.taska;

import java.util.Arrays;

public class TaskAMain {

    public static void main(String[] args) {

        DeptEmployeeData dep = new DeptEmployeeData();
            DeptEmployee[] result= dep.getDeptData();
            NameComparator com = new NameComparator();
            Arrays.sort(result, com);
            System.out.println("Sort by first name(Naturally) using outside comparator");
            for (DeptEmployee answer: result) {
                System.out.println(answer.getName());

            }





    }
}
