package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeNumberTest extends BaseTest {

    @Test(dataProvider = "dataForNegativeNumbersTest")
    public void numberIsNegativeTest(long number, boolean expectedresult){
        boolean result = calculator.isNegative(number);
        Assert.assertEquals(expectedresult, result);
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
