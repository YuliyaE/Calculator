package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowerCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForPowTest")
    public void testPower(double number, double degree, double expectedResult) {
        double result = calculator.pow(number, degree);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of sinus");

    }

    @DataProvider(name = "dataForPowTest")
    public Object[][] dataForPowerTest() {
        return new Object[][]{
                {3, 3, 27},
                {0, 0, 1},
                {-5, 3, -125},
                {4, 1.9, 13.92}
        };
    }


}
