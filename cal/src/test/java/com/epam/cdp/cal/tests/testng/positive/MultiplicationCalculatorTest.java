package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForMultiplicationTest")
    public void testMultiplication(double firstNumber, double secondNumber,double expectedResult) {
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult, 0.01,"Invalid result of multiplication");
    }

    @Test(dataProvider = "dataForMultiplicationTest")
    public void testMultiplication(long firstNumber, long secondNumber, long expectedResult) {
        long result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult, 0.01,"Invalid result of multiplication");
    }


    @DataProvider(name = "dataForDoubleMultiplicationTest")
    public Object[][] dataForDoubleMultiplication() {
        return new Object[][]{
                {4.3, 3.5, 15.05},
                {5.0, 7.0, 35.0},
                {18, 4, 72},
                {17.31, 14.7, 254.457},
        };
    }

    @DataProvider(name = "dataForMultiplicationTest")
    public Object[][] dataForMultiplicationTest() {
        return new Object[][]{
                {5, 7, 35},
                {4, 3, 12},
                {18, 4, 72},
                {9, 5, 45},
        };
    }


}
