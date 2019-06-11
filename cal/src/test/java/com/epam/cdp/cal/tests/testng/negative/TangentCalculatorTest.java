package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForTangentTest", groups = {"trigonometry"})
    public void testTangent(double number, double expectedResult) {
        double result = calculator.tg(number);
        Assert.assertNotEquals(expectedResult, result, 0.01, "Invalid result of tangent");
        checkTime();
    }

    @DataProvider(name = "dataForTangentTest")
    public Object[][] dataForTangentTest() {
        return new Object[][]{
                {0, 1},
                {7, 0.45},
                {1, 1.95},
                {-1, -3.55}
        };
    }

}
