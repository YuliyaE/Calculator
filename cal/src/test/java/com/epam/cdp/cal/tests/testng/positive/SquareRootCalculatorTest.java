package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareRootCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForSqrtTest")
    public void testSqrt(double number, double expectedResult) {
        double result = calculator.sqrt(number);
        Assert.assertEquals(expectedResult, result, "Invalid result of square root");

    }

    @DataProvider(name = "dataForSqrtTest")
    public Object[][] dataForSqrtTest() {
        return new Object[][]{
                {64, 8},
                {16, 4},
                {-1, 1},
                {25, 5}
        };
    }

}
