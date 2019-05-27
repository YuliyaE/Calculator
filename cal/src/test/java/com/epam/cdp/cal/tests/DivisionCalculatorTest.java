package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

public class DivisionCalculatorTest extends BaseTest {

    @Test(dataProvider = "dataForDivisionTest")
    public void divTest(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of division");
    }

    @Test(dataProvider = "dataForExceptionDivisionTest", expectedExceptions = NumberFormatException.class)
    public void divExceptionTest(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of division");
    }

    @Test(dataProvider = "dataForDoubleDivisionTest")
    public void divTest(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of division");
    }

    @DataProvider(name = "dataForDivisionTest")
    public Object[][] dataForDiv() {
        return new Object[][]{
                {24, 4, 6},
                {15, 3, 5},
                {84, 4, 21},
                {50, 5, 10}
        };
    }

    @DataProvider(name = "dataForDoubleDivisionTest")
    public Object[][] dataForDoubleDiv() {
        return new Object[][]{
                {24, 4, 6.0},
                {15, 3, 5.0},
                {84, 4, 21.0},
                {15, 0, Infinity},
                {0, 0, NaN}
        };
    }

    @DataProvider(name = "dataForExceptionDivTest")
    public Object[][] dataForExceptionDiv() {
        return new Object[][]{
                {50, 0, 10}
        };
    }


}
