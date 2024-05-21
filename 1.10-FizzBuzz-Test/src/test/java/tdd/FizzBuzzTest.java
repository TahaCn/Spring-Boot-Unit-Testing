package tdd;

import com.luv2code.junitdemo.tdd.FizzBuzz;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {


    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3),"Should return Fizz");
    }

    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5),"Should return Buzz");
    }

    @DisplayName("Divisible by Three And Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15),"Should return FizzBuzz");
    }

    @DisplayName("Not Divisible by Three And Five")
    @Test
    @Order(4)
    void testForNotDivisibleByThreeAndFive(){
        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1),"Should return 1");
    }

    @DisplayName("Testing With Small Data File")
    @ParameterizedTest(name = "value{0}, expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testSmallDataFile(int value,String expected){

        assertEquals(expected, FizzBuzz.compute(value));
    }

    @DisplayName("Testing With Medium Data File")
    @ParameterizedTest(name = "value{0}, expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(6)
    void testMediumDataFile(int value,String expected){

        assertEquals(expected, FizzBuzz.compute(value));
    }

    @DisplayName("Testing With Large Data File")
    @ParameterizedTest(name = "value{0}, expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(7)
    void testLargeDataFile(int value,String expected){

        assertEquals(expected, FizzBuzz.compute(value));
    }
}
