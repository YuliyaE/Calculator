package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentCalculatorTest extends BaseTest{


    @Test(dataProvider = "dataForTgTest")
    public void ctgTest(double a, double expectedResult) {
       double result = calculator.tg(a);
       Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of tangent");

    }

    @DataProvider(name = "dataForTgTest")
    public Object[][] dataForCtg() {
        return new Object[][]{
                {0, 0.0},
                {7, 0.87},
                {1, 1.55},
                {-1, -1.55}
        };
    }

}
