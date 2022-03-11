package w1l2.CS390_Assignments.w3l8.prob1;

import java.util.Arrays;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] PersonArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		PersonArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room else call resize()
	public void add(Person s) {
		//To check the input is null or not
		if(s==null) return;
		if (size== PersonArray.length)   resize();

			PersonArray[size++] =s;
		}

	// 2. get person information by passing index
	public Person get(int i) {
		//To Check of the input is greater than array length and less than zero
		if(i < 0 || i > PersonArray.length)
			return  null;
		return PersonArray[i] ;

	}

	// 3. Find the Person object using lastname
	public boolean find(String lastName) {
		if (lastName == null || lastName.equals(" "))
			return false;
		for (int i = 0; i < size(); i++) {
			if (PersonArray[i].getLast().equals(lastName)) {
				return true;
			}
		}
		return false;
	}
  	// 4. Remove the person object by passing its lastname
	public boolean remove(String lastName) {
		boolean isremove = false;
		if (size == 0 || lastName.equals("") || lastName == null)
			return false;
		int index = 0;
		for (int i = 0; i < size; i++) {
			if (PersonArray[i].getLast().equals(lastName)) {
				index = i;
				isremove = true;
			}
		}
		if (isremove) {

			for (int j = index; j < size; j++) {
				PersonArray[j] = PersonArray[j + 1];
			}
			size--;
		}/*else{
			return false;
			//System.out.println("No such element found");
		}*/
		return false;
	}
  	// 5. Resizing the list
	private void resize() {
		int capacity = 2* PersonArray.length;
	    PersonArray = Arrays.copyOf(PersonArray, capacity );
	}
   // To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(PersonArray[i] + ", \n");
		}
		sb.append(PersonArray[size - 1] + "]");
		return sb.toString();
	}
   // Return the size
	public int size() {

		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Renuka", "Mohanraj", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));
		System.out.println("\nSize() : " + list.size() + "\n" + list);

		list.remove("Mohanraj");
		list.remove("Anne");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		//list.insert(new Person("Arun", "Jetlie", 32), 2);
		System.out.println("\nSearching of Lermon LastName: " + list.find("Joe"));
		System.out.println("\nSearching not in the list: " + list.find("Pauliiui"));
		System.out.println(list.get(2));
		//System.out.println(list.find("Lermon"));
		System.out.println("Is Rakem is in the list removed: "+list.remove("Rakem"));
	}
}