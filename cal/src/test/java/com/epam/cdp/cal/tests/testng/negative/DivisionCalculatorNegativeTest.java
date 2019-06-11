package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionCalculatorNegativeTest extends BaseTest {

    @Test(dataProvider = "dataForDivisionTest")
    public void testDivision(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertNotEquals(result, expectedResult, "Invalid result of division");
    }

    @DataProvider(name = "dataForDivisionTest")
    public Object[][] dataForDivisionTest() {
        return new Object[][]{
                {24, 4, 3},
                {15, 3, 7},
                {84, 4, 14.4},
                {50, 5, 12}
        };
    }


}
