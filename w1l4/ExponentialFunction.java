package w1l2.CS390_Assignments.w1l4;

public class ExponentialFunction {
    public static double power (double x, int n){
        if (n == 0){
            return 1;
        }else {
          return x * power(x,n-1);
        }
    }

    public static void main(String[] args) {
        double ans= power(2,3);
        System.out.println(ans);
    }
}
