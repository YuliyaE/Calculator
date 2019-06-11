package com.epam.cdp.cal.tests.junit;

import com.epam.cdp.cal.tests.junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SinusCalculatorTest extends BaseTest {


    private double firstNumber;
    private double expectedResult;

   public SinusCalculatorTest(double firstNumber, double expectedResult){
       this.firstNumber = firstNumber;
       this.expectedResult = expectedResult;
   }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {3, 0.14},
                {0, 0.0},
                {-1, -0.84},
                {1, 0.84}
        });
    }

    @Test
    public void sinusTest() {
        double result = calculator.sin(firstNumber);
        Assert.assertEquals(expectedResult, result);
    }

}
