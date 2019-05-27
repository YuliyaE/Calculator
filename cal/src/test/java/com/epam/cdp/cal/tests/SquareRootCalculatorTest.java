package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareRootCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForSqrtTest")
    public void sinTest(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        Assert.assertEquals(expectedResult, result, "Invalid result of square root");

    }

    @DataProvider(name = "dataForSqrtTest")
    public Object[][] dataForSin() {
        return new Object[][]{
                {64, 8},
                {16, 4},
                {-1, 1},
                {25, 5}
        };
    }

}
