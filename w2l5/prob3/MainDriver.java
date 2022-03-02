package w1l2.CS390_Assignments.w2l5.prob3;

public class MainDriver {

    public static void main(String[] args) {
     Figure up = new UpwardHat();
     Figure up2 = new UpwardHat();
     Figure down = new DownwardHat();
     Figure face = new FaceMaker();
     Figure vertical= new Vertical();

       Figure[] fg = {up2,up,down,face,vertical};
        for (Figure result: fg) {
           result.getFigure();
        }
        System.out.println(" ");
        System.out.print("+++++++++++++++++++++++++++++++++++++");
        for (Figure result: fg) {
            System.out.print("\n"+result.getClass().getSimpleName()+": ");
            result.getFigure();
        }
    }
}
