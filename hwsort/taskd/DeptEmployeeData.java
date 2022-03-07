package w1l2.CS390_Assignments.hwsort.taskd;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

public void reverseByName(DeptEmployee[] data) {
	Comparator com = new Comparator<DeptEmployee>() {
		@Override
		public int compare(DeptEmployee o1, DeptEmployee o2) {

			return o2.getName().compareTo(o1.getName());
		}
	};
	Arrays.sort(data, com);
}
	/*Arrays.sort(data, new Comparator<DeptEmployee>() {
		@Override
		public int compare(DeptEmployee o1, DeptEmployee o2) {
			return o2.getName().compareTo(o1.getName());
		}
	});*/
//}
	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",40000, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",50000,LocalDate.of(1979,1,2));
		Professor p2 = new Professor("Anna",45000,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",50000,LocalDate.of(1987,2,15),10);
		Secretary s1 = new Secretary("Janet",40000,LocalDate.of(1995,4,22),15);
		
		DeptEmployee[]  department = {p0,p1,p2,s0,s1};
		return department;

	}

	public static void main(String[] args) {
		DeptEmployeeData department = new DeptEmployeeData();
		DeptEmployee[] reverse= getDeptData();
		department.reverseByName(reverse);
		System.out.println("Sort by reverse name using anonymous inner class");
		for ( DeptEmployee answer: reverse) {
			System.out.println(answer.getName());
		}
	}

}
