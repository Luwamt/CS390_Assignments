package w1l2.CS390_Assignments.assignment1;

public class RemoveDups {

	public static void main(String[] args) {
		
	String[] animals= {"horse", "dog", "cat", "horse", "dog"};
       
	String[] ans = duplicate(animals);
	System.out.print("[" );
	for(String s: ans) {
		System.out.print( s +" ");
	}
	System.out.print("]");
	}

	public static String[] duplicate(String [] dup) {
		String[] tem = new String[dup.length];
		int index=0;
		for(int i=0;i< dup.length;i++) {
			boolean isduplicate = false;
			for(int j=0;j < index;j++) {
				if(dup[i] == dup[j]) {
					isduplicate=true;
					break;
				}
			}
				if(isduplicate == false)
					tem[index++] = dup[i];
				}
		String[] newarr = new String[index];
		for(int i=0;i< newarr.length;i++) {
		                newarr[i]=dup[i];
		}
		return newarr;
	}
}