package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CotangentCalculatorNegativeTest extends BaseTest {

    @Test(dataProvider = "dataForCotangentTest", groups = {"trigonometry"})
    public void testCotangentNegative(double number, double expectedResult) {
        double result = calculator.ctg(number);
        Assert.assertNotEquals(expectedResult, result, 0.01, "Invalid result of cotangent");
    }

    @DataProvider(name = "dataForCotangentTest")
    public Object[][] dataForCotangent() {
        return new Object[][]{
                {1, Infinity},
                {7, 3.24},
                {1, 0.341},
        };
    }


}
