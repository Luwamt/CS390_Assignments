package w1l2.CS390_Assignments.assignment1;

public class Prog4 {

	public static void main(String[] args) {
		
		float num= 1.27f, num2=	3.881f, num3 =9.6f;
		/*
		 * Prog4- 1;
		 */
		
		int sum= (int)(num+num2+num3);
		System.out.println(sum);
		/*
		 * Prog4- 2;
		 */
		float sumR = (num+num2+num3);
		
		int tem = (int)Math.round(sumR);
		System.out.println(tem);
		

	}

}
