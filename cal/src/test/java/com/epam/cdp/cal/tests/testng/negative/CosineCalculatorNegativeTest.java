package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineCalculatorNegativeTest extends BaseTest {

    @Test(dataProvider = "dataForNegativeCosineTest", groups = {"trigonometry"})
    public void testCosineNegative(double number, double expectedResult) {
        double result = calculator.cos(number);
        Assert.assertNotEquals(expectedResult, result, 0.01, "Invalid result of cosine");
    }

    @DataProvider(name = "dataForNegativeCosineTest")
    public Object[][] dataForCosineTest() {
        return new Object[][]{
                {24, 0.72},
                {17, -0.475},
                {3, -0.58},
        };
    }

}
