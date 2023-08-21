package ru.heydancer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest extends BaseTest {

    @Test
    public void testSum() throws InterruptedException {
        int expected = 4;
        int actual = calculator.sum(2, 2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        int expected = 3;
        int actual = calculator.division(9, 3);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSubstruction() {
        int expected = 5;
        int actual = calculator.substruction(10, 5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication() {
        int expected = 42;
        int actual = calculator.multiplication(6, 7);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        final ArithmeticException exception = Assertions.assertThrows(
                ArithmeticException.class, () -> calculator.division(9, 0));

        Assertions.assertEquals("/ by zero", exception.getMessage());
    }
}