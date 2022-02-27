package w1l2.CS390_Assignments.w1l4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch() {
        BinarySearch bs= new BinarySearch();
        int[] arr= {2, 9, 70, 10, 95, 42, 69, 11, 26, 38, 88} ;
        int calling = bs.binarySearch(arr,42);
        int checking = 5;
        assertEquals(checking,calling); ;
    }
}