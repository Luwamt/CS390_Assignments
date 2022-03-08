package w1l2.CS390_Assignments.w3l8.prob3;

import java.util.Comparator;

public class ComparatorClass  implements Comparator<Marketing> {
    @Override
    public int compare(Marketing o1, Marketing o2) {

        return Double.compare(o1.getSalesamount(), o2.getSalesamount());

    }
}

