package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangentCalculatorTest extends BaseTest {


    @Test(dataProvider = "dataForTangentTest", groups = {"trigonometry"})
    public void testTangent(double number, double expectedResult) {
        double result = calculator.tg(number);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of tangent");
        checkTime();
    }

    @DataProvider(name = "dataForTangentTest")
    public Object[][] dataForTangentTest() {
        return new Object[][]{
                {0, 0.0},
                {7, 0.87},
                {1, 1.55},
                {-1, -1.55}
        };
    }

}
