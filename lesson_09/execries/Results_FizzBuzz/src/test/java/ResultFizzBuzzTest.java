import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultFizzBuzzTest {

    @Test
    void testFizzBuzz() {
        int number = 3;
        String expected = "Fizz";

        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz2() {
        int number = 5;
        String expected = "Buzz";

        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testconvertToVietNamse() {
        int number = 8;
        String expected = "tám";

        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testconvertToVietNamse2() {
        int number = 91;
        String expected = "chín mươi mốt";
        String result = ResultFizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}