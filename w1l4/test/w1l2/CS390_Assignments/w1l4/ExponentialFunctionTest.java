package w1l2.CS390_Assignments.w1l4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialFunctionTest {

    @Test
    void power() {
        ExponentialFunction ex= new ExponentialFunction();
        double calling = ex.power(2.0,3);
        double checking = 8.0;
        assertEquals(checking,calling);
    }
}