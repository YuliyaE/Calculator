package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CotangentCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForCotangentTest", groups = {"trigonometry"})
    public void testCotangent(double number, double expectedResult) {
        double result = calculator.ctg(number);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of cotangent");
    }

    @DataProvider(name = "dataForCotangentTest")
    public Object[][] dataForCotangentTest() {
        return new Object[][]{
                {0, Infinity},
                {7, 1.14},
                {1, 0.642},
                {-1, -0.642}
        };
    }

}
