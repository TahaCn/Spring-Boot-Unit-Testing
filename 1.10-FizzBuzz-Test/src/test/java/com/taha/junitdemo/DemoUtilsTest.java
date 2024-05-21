package com.taha.junitdemo;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {
    DemoUtils demoUtils;

    @BeforeEach
    void setBeforeEach(){
        demoUtils = new DemoUtils();
        //System.out.println("@BeforeEach executes before the execution of each test method!!!");
    }

    @DisplayName("Multiply")
    @Test
    void testMultiply(){
        assertEquals(12,demoUtils.multiply(4,3),"ERROR");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    @Order(1)
    void Test_Equals_And_Not_Equals(){
        //System.out.println("Running test: TestEqualsAndNotEquals.");
        assertEquals(6,demoUtils.add(2,4)," 2+4 must be 6");
        assertNotEquals(6,demoUtils.add(1,9)," 2+4 must be 6");
    }
    @Test
    @Order(0)
    @DisplayName("Null and Not Null")
    void Test_Null_And_Not_Null(){
        //System.out.println("Running test: TestNullAndNotNull.");
        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), " Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    void TestSameAndNotSame(){
        String str = "luv2code";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate()," Objects should refer to same object");
        assertNotSame(str,demoUtils.getAcademy()," Objects should notw refer to same object");
    }

    @Test
    @DisplayName("True and False")
    @Order(30)
    void testTrueAndFalse(){
        int grade_1 = 10;
        int grade_2 = 5;

        assertTrue(demoUtils.isGreater(grade_1,grade_2), "This should return true");
        assertFalse(demoUtils.isGreater(grade_2,grade_1), "This should return false");
    }
    @Test
    @DisplayName("Array Equals")
    void TestArrayEquals(){
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray,demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays should be same");
    }
    @Test
    @DisplayName("Iterable Equals")
    void TestIterableEquals(){
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"Expected list should be same as actual list");
    }
    @Test
    @DisplayName("Lines Match")
    void TestLinesMatch(){
        List<String> theList = List.of("luv","2","code");
        assertIterableEquals(theList,demoUtils.getAcademyInList(),"Lines should match!");
    }
    @Test
    @DisplayName("Throws and Does Not Throw")
    void TestThrowsAndDoesNotThrows(){
        assertThrows(Exception.class, () -> {demoUtils.throwException(-1);},"Should throw exception");
        assertDoesNotThrow(()->{demoUtils.throwException(10);},"Should not throw exception");
    }
    @Test
    @DisplayName("Timeout")
    void TestTimeout(){
        assertTimeoutPreemptively(Duration.ofSeconds(3), ()->{demoUtils.checkTimeout();},
                "Method should execute in 3 seconds");
    }
    /*
    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running @0AfterEach");
        System.out.println();
    }

    @BeforeAll
    static void setUpBeforeEachClass(){
        System.out.println("@BeforeAll executes only once before all test methods execution in the class.");
    }

    @AfterAll
    static void tearDownAfterEachClass(){
        System.out.println("@AfterAll executes only once before all test methods execution in the class.");
    }

     */
}
