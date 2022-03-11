package w1l2.CS390_Assignments.w3l8.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sum=0.0;
		for (int i = 0; i < aList.size(); i++) {
			sum+=aList.get(i).getSalary();
		}
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
