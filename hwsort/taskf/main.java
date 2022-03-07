package w1l2.CS390_Assignments.hwsort.taskf;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        DeptEmployeeData.StaticInnerClass staic = new DeptEmployeeData.StaticInnerClass();
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data,staic);
        for ( DeptEmployee result: data) {
            System.out.println(result.getSalary());
        }
    }
}
