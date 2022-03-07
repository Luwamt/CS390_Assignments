package w1l2.CS390_Assignments.w2l5.prob5;

public class MainComputer {
    public static void main(String[] args) {

        Computer  hp = new Computer("Hp","core i7",16,1078);
        Computer  hp2 = new Computer("Hp","core i7",16,1078);
        Computer  dell = new Computer("Dell","core i5,",32,1089);
        Computer  mac = new Computer("Mac","core i3,",8,1038);

        System.out.println(hp.equals(hp));
        System.out.println(dell.equals(mac));
        System.out.println("++++++++++++++++++++++++++++");
        dell =hp2;
        System.out.println(dell.equals(hp));
        System.out.println(dell==hp);
    }
}
