package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForPowTest")
    public void powTest(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of sinus");

    }

    @DataProvider(name = "dataForPowTest")
    public Object[][] dataForSin() {
        return new Object[][]{
                {3, 0.14},
                {0, 0.0},
                {-1, -0.84},
                {1, 0.841}
        };
    }


}
