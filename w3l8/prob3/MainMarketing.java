package w1l2.CS390_Assignments.w3l8.prob3;

import java.util.*;

public class MainMarketing {

    public static void main(String[] args) {

        Marketing market1= new Marketing("Lwam", "Mobile",1000);
        Marketing market2= new Marketing("Filmon", "Tv",1000);
        Marketing market3= new Marketing("Arkan", "Computer",1800);
        Marketing market4= new Marketing("Mercy", "Watch",1500);
        Marketing market5= new Marketing("Selam", "Hair Drier",1080);
        Marketing market6= new Marketing("Selam", "Hair Drier",2550);
        Marketing market7= new Marketing("Jossi", "Tablet",2200);

        List<Marketing> list = new ArrayList<>(Arrays.asList(market1,market2,market3,market4,market7));

        list.add(market5);
        list.add(market6);
        list.add(new Marketing("John"," Flash Drive",100));
        System.out.println("The  Orginal size of my list is: "+list.size());
        list.remove(market1);
        list.remove(market5);
        System.out.println("After removing the size of my list is: "+list.size());
        System.out.println("Before sorting the list by salesAmount");
        for (Marketing result : list) {
            System.out.println(result);
        }
        Collections.sort(list,new ComparatorClass());
        System.out.println("+++++++++++After sorting the list by salesAmount in Natural order++++++++++++++++++++++++++++++++++");
        //System.out.println("After sorting  the list by salesAmount: ");
        for (Marketing result : list) {
            System.out.println(result);
        }
        System.out.println("++++++++++++++++Check the equality to be consistent with comparator++++++++++++++++++++++++++++++++++");
        System.out.println("Check the equality by salesAmount: "+market1.equals(market2));
        System.out.println("Check the equality: "+market5.equals(market6));


        System.out.println("++++++++++++++++++List of names more than 1000 sales amount  before Sorting+++++++++++++++++++++++++ ");
        List<Marketing> ans= listMoreThan1000(list);
        for (Marketing result : ans) {
            System.out.println(result);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //Sorting by EmployeeName in natural order using Anonymous class
       Collections.sort(ans, new Comparator<Marketing>(){
            @Override
            public int compare(Marketing o1, Marketing o2){
                return o1.getEmployeename().compareToIgnoreCase(o2.getEmployeename());
            }
        });
        //System.out.println("+++++++++++++++++++A list of more than 1000 sales amount sorted by name++++++++++++++++++");

        System.out.println("++++++++++List of more than 1000 sales amount Sorting by EmployeeName in natural order using Anonymous class+++++++++");

        for (Marketing result : ans) {
            System.out.println(result);
        }
    }


public static List<Marketing> listMoreThan1000(List<Marketing> list){
List<Marketing> more1000= new ArrayList<>();
    for (int i = 0; i <list.size() ; i++) {
        if (list.get(i).getSalesamount() > 1000)
            more1000.add(list.get(i));
    }
    return  more1000;
}
}
