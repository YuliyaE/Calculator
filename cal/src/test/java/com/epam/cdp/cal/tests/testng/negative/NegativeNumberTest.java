package com.epam.cdp.cal.tests.testng.negative;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeNumberTest extends BaseTest {

    @Test(dataProvider = "dataForNegativeNumbersTest")
    public void testIfNumberIsNegative(long number, boolean expectedResult){
        boolean result = calculator.isNegative(number);
        Assert.assertEquals(expectedResult, result);
    }

    @DataProvider(name = "dataForNegativeNumbersTest")
    public Object[][] dataForNegativeNumbersTest(){
        return new Object[][]{
                {-9, true},
                {0, false},
                {-4, true},
                {8, false}
        };
    }

}
