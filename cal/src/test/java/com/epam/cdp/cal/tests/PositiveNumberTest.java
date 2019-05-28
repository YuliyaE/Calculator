package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveNumberTest extends BaseTest {

    @Test(dataProvider = "dataForPositiveNumbersTest")
    public void numberIsPositiveTest(long number, boolean expectedResult){
        boolean result = calculator.isPositive(number);
        Assert.assertEquals(expectedResult, result);
    }

    @DataProvider(name = "dataForPositiveNumbersTest")
    public Object[][] dataForPositiveNumbersTest(){
        return new Object[][]{
                {9, true},
                {0, false},
                {7, true},
                {-14, false}
        };
    }



}
