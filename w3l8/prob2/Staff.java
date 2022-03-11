package w1l2.CS390_Assignments.w3l8.prob2;

public final class Staff implements EmployeeData {
	private String name;
	private double salary;
	private int numDependants;
	public Staff(String name, double salary, int numDependants) {
		this.name = name;
		this.salary = salary;
		this.numDependants = numDependants;
	}
	
	public String getName() {

		return name;
	}
	@Override
	public double getSalary() {

		return salary;
	}
	public int getNumDependants() {

		return numDependants;
	}
	@Override
	public String toString(){
		return "Name: "+ name+" Salary: "+ salary+" Dependents:"+ numDependants;
	}
}
