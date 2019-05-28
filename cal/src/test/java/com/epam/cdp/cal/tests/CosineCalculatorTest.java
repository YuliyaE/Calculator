package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForCosTest", groups = {"trigonometry"})
    public void cosTest(double number, double expectedResult) {
        double result = calculator.cos(number);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of cosine");

    }

    @DataProvider(name = "dataForCosTest")
    public Object[][] dataForCos() {
        return new Object[][]{
                {24, 0.42},
                {17, -0.275},
                {3, -0.98},
                {1, 0.54}
        };
    }

}
