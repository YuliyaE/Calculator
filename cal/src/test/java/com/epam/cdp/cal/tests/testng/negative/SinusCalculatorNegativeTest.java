package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinusCalculatorNegativeTest extends BaseTest {

    @Test(dataProvider = "dataForSinusTest", groups = {"trigonometry"})
    public void testSinus(double number, double expectedResult) {
        double result = calculator.sin(number);
        Assert.assertNotEquals(expectedResult, result, 0.01, "Invalid result of sinus");

    }

    @DataProvider(name = "dataForSinusTest")
    public Object[][] dataForSinusTest() {
        return new Object[][]{
                {3, 3.14},
                {0, 1.0},
                {-1, -0.95},
                {1, 0.50}
        };
    }

}
