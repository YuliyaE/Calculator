package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationCalculatorNegativeTest extends BaseTest {

    @Test(dataProvider = "dataForMultiplicationTest")
    public void testMultiplication(double firstNumber, double secondNumber,double expectedResult) {
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of multiplication");
    }

    @DataProvider(name = "dataForMultiplicationTest")
    public Object[][] dataForMultiplication() {
        return new Object[][]{
                {4.3, 3.5, 10},
                {18, 4, 92},
                {17.31, 14.7, 54},
                {15, 0, 1}
        };
    }
}
