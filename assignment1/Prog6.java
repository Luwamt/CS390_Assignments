package w1l2.CS390_Assignments.assignment1;

public class Prog6 {

	public static void main(String[] args) {
		
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		System.out.println(min(arr));

	}
    public static int min(int[] arrayOfInts) {
	 int min = arrayOfInts[0];
	for(int i=0;i<arrayOfInts.length;i++) {
		if(arrayOfInts[i] < min) {
			min= arrayOfInts[i];
		}
	}
	return min;
}

}
