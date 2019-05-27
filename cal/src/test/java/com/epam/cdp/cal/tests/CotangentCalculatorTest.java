package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CotangentCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForCotangentTest")
    public void cotangentTest(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(expectedResult, result, 0.01, "Invalid result of cotangent");

    }

    @DataProvider(name = "dataForCotangentTest")
    public Object[][] dataForCotangent() {
        return new Object[][]{
                {0, Infinity},
                {7, 1.14},
                {1, 0.642},
                {-1, -0.642}
        };
    }


}
