import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimleCalculatorTest {

    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0Andd0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1Andd0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0Andd1() {
        int first = 0;
        int second = 1;
        int expected = 1;

        int result = SimleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing add 5 + 3")
    public void testAdd5Andd3() {
        int first = 5;
        int second = 3;
        int expected = 8;

        int result = SimleCalculator.add(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub0Andd0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 1 - 0")
    public void testSub1Andd0() {
        int first = 1;
        int second = 0;
        int expected = 1;

        int result = SimleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 0 - 1")
    public void testSub0Andd1() {
        int first = 0;
        int second = 1;
        int expected = -1;

        int result = SimleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing sub 5 - 3")
    public void testSub5Andd3() {
        int first = 5;
        int second = 3;
        int expected = 2;

        int result = SimleCalculator.sub(first, second);
        assertEquals(expected, result);
    }
}