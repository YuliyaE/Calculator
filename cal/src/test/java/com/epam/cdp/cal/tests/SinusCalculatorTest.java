package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinusCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForSinusTest", groups = {"trigonometry"})
    public void sinusTest(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(expectedResult, result, 0.01,  "Invalid result of sinus");

    }

    @DataProvider(name = "dataForSinusTest")
    public Object[][] dataForSinus() {
        return new Object[][]{
                {3, 0.14},
                {0, 0.0},
                {-1, -0.84},
                {1, 0.84}
        };
    }

}
