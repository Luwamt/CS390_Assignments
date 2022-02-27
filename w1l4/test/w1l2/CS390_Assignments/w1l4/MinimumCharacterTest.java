package w1l2.CS390_Assignments.w1l4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCharacterTest {

    @Test
    void minimum() {
        MinimumCharacter m= new MinimumCharacter();
        char calling = m.minimum("lwam");
        char checking = 'a';
        assertEquals(checking,calling);
    }
}