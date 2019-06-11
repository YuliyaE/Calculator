package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerCalculatorNegativeTest extends BaseTest {

    @Test(dataProvider = "dataForPowTest")
    public void testPower(double number, double degree, double expectedResult) {
        double result = calculator.pow(number, degree);
        Assert.assertNotEquals(expectedResult, result, 0.01, "Invalid result of sinus");

    }

    @DataProvider(name = "dataForPowTest")
    public Object[][] dataForPowerTest() {
        return new Object[][]{
                {3, 3, 9},
                {0, 0, 0},
                {-5, 3, -625},
                {4, 1.9, 17.92}
        };
    }


}
