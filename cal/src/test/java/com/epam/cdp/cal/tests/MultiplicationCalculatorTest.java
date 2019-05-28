package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForDoubleMultiplicationTest")
    public void multiplicationTest(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of multiplication");
    }

    @Test(dataProvider = "dataForMultiplicationTest")
    public void multiplicationTest(long a, long b, long expectedResult) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of multiplication");
    }


    @DataProvider(name = "dataForDoubleMultiplicationTest")
    public Object[][] dataForDoubleMultiplication() {
        return new Object[][]{
                {4.3, 3.5, 15.05},
                {5.0, 7.0, 35.0},
                {18, 4, 72},
                {9, 5, 45},
        };
    }

    @DataProvider(name = "dataForMultiplicationTest")
    public Object[][] dataForMultiplication() {
        return new Object[][]{
                {5, 7, 35},
                {4, 3, 12},
                {18, 4, 72},
                {9, 5, 45},
        };
    }


}
