package w1l2.CS390_Assignments.w2l6.hwsort.taskb;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {
 //static  class MemberInnerClass implements Comparator<DeptEmployee> {
 public class MemberInnerClass implements Comparator<DeptEmployee> {
	@Override
	public int compare(DeptEmployee o1, DeptEmployee o2){

		return o1.getName().compareTo(o2.getName());
	}

}
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

		DeptEmployeeData.MemberInnerClass inner = new DeptEmployeeData(). new MemberInnerClass();
		DeptEmployee[] data = getDeptData();
		System.out.println("Sort by first name(Naturally) using inner member class");
		Arrays.sort(data, inner);
		for ( DeptEmployee result: data) {
			System.out.println(result.getName());
		}
		//DeptEmployeeData dep = new DeptEmployeeData();
		//DeptEmployeeData.MemberInnerClass inner = dep. new MemberInnerClass();
		//MemberInnerClass inner = new MemberInnerClass();
	}

}