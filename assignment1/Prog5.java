package w1l2.CS390_Assignments.assignment1;

public class Prog5 {

	public static void main(String[] args) {
		
	int[] a= {5,6,-4,3,1};	
	int[] b = { 3,8,9,11};	
	
	int[] comb = combine(a,b);
	System.out.print("[ ");
	for(int i=0; i< comb.length; i++) {
		
		System.out.print(comb[i]+ " ");
	}
	System.out.println("]");

	}
	public static int[] combine(int[] a, int[] b) {
		int add =0;
		int len= a.length+b.length;
		int[] result = new int[len];
		for(int i=0; i< a.length; i++) {
			result[i]= a[i];
			if(i== a.length-1) 
				add=i+1;
			
		}
			for(int j=0; add< result.length; add++, j++) {
				result[add]= b[j];	
		}
		return result;
	}
	/**
	 * Second Method
	 * @param a
	 * @param b
	 * @return
	 */
	  public static int[] combineSecond(int[] a, int[] b) {
	  
	  int len= a.length+b.length; 
	  int[] result = new int[len]; 
	  System.arraycopy(a,0, result, 0, a.length);
	  System.arraycopy(b, 0, result, a.length, b.length);
	  
	  return result;
	  
	  }
	 
}
