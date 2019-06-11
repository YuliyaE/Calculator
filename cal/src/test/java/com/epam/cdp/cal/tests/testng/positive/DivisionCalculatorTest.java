package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForDivisionTest")
    public void testDivision(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult, "Invalid result of division");
    }

    @Test(dataProvider = "dataForDivisionExceptionTest", expectedExceptions = NumberFormatException.class)
    public void testDivisionException(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult, "Invalid result of division");
    }

    @Test(dataProvider = "dataForDivisionTest")
    public void testDivision(long firstNumber, long secondNumber, double expectedResult) {
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult, "Invalid result of division");
    }

    @DataProvider(name = "dataForDivisionTest")
    public Object[][] dataForDivisionTest() {
        return new Object[][]{
                {24, 4, 6},
                {15, 3, 5},
                {84, 4, 21},
                {50, 5, 10}
        };
    }


    @DataProvider(name = "dataForDivisionExceptionTest")
    public Object[][] dataForDivisionExceptionTest() {
        return new Object[][]{
                {50, 0, 10}
        };
    }


}
