package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosineCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForCosineTest", groups = {"trigonometry"})
    public void testCosine(double number, double expectedResult) {
        double result = calculator.cos(number);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of cosine");
    }

    @DataProvider(name = "dataForCosineTest")
    public Object[][] dataForCosineTest() {
        return new Object[][]{
                {24, 0.42},
                {17, -0.275},
                {3, -0.98},
                {1, 0.54}
        };
    }

}
