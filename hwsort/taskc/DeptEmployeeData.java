package w1l2.CS390_Assignments.hwsort.taskc;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",40000, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",50000,LocalDate.of(1979,1,2));
		Professor p2 = new Professor("Anna",45000,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",50000,LocalDate.of(1987,2,15),10);
		Secretary s1 = new Secretary("Janet",40000,LocalDate.of(1995,4,22),15);
		
		DeptEmployee[]  department = {p0,p1,p2,s0,s1};
		return department;

	}
	public  void reverseSalary(DeptEmployee[] data){

		 class LocalMemberClass implements Comparator<DeptEmployee> {
			@Override
			public int compare(DeptEmployee o1, DeptEmployee o2){
				Double s1 = o1.getSalary();
				Double s2 = o2.getSalary();
				return  (s2.compareTo(s1));
			}
		}
		LocalMemberClass local = new LocalMemberClass();
		Arrays.sort(data, local);
		/*System.out.println("Sorting by Salary in reverse order using Local Class");
		for ( DeptEmployee result : data) {
			System.out.println(result.getSalary());
		}*/
	}

	public static void main(String[] args) {
		DeptEmployeeData emp = new DeptEmployeeData();
		DeptEmployee[] ans = getDeptData();
		//emp.reverseSalary(ans);
		emp.reverseSalary(ans);
		System.out.println("Sorting by Salary in reverse order using Local Class");
		for ( DeptEmployee result : ans) {
			System.out.println(result.getSalary());
		}
	}
}
