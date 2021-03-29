//package ourFirstTddClas;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CalculatorTest {
//    private Calculator calculator;
//int counter;
//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//
//        System.out.println("Before each number of rns: " + counter);
//    }
//
//    @Test
//    void addTwoNumbersTest() {
////    given
//
////        when
//        int sum = calculator.add(3.2);
//                assert when you are expecting a result
//        assertEquals(5, calculator.add(3, 2));
////        this assertequals is same as
//        assertTrue(calculator.add(3, 2) == 5);
//        assertTrue(calculator.add(4, 4) == 8);
//    }
//
//    @Test
//    void twoNumbersCanBeMultiplied() {
//        Calculator calculator = new Calculator();
//        assertEquals(4, calculator.multiply(2, 2));
//        assertEquals(4, calculator.multiply(4, 1));
//    }
//
//    @Test
//    @DisplayName("Testing for float numbers")
//    void divideTwoNumbersTest() {
//        assertEquals(2, calculator.divide(6, 3));
//        assertEquals(3, calculator.divide(15, 5));
//
//    }
//
//    @Test
//    @DisplayName("Division by zero returns zero")
//    void divisionByZeroTest() {
//        assertEquals(0, calculator.divide(5, 0));
//    }
//    @Test
//    void difference_canBeCalculated(){
//        assertEquals(5, calculator.subtract(10,5));
//    }
//    @Test
//    void difference_willProduceAbsoluteResult(){
//        assertEquals(5, calculator.subtract(5, 10));
//    }
//
//}
//
//
////
////    @AfterEach
////    void tearDown() {
////    }
