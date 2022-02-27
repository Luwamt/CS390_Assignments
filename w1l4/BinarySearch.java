package w1l2.CS390_Assignments.w1l4;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr,int target) {

        return binarySearch(arr,target,0,arr.length-1);
    }
        public static int binarySearch(int[] arr,int target,  int lownum, int uprnum){
        if( lownum > uprnum){
            return -1;
        }
        int midV=(lownum+uprnum)/2;
        if(arr[midV] == target){
            return midV;
        }else if (arr[midV] < target) {
            return binarySearch(arr, target, midV +1, uprnum);
        }else
            return  binarySearch(arr, target, midV - 1, lownum);

    }

    public static void main(String[] args) {
       int[] arr= {2, 9,45,96,125,48,78,36,21,26,56,46} ;
          Arrays.sort(arr);
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
        System.out.println(binarySearch(arr,125));
    }

}
