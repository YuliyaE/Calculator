package com.epam.cdp.cal.tests.junit;

import com.epam.cdp.cal.tests.junit.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumCalculatorTest extends BaseTest {

    private long firstNumber;
    private long secondNumber;
    private long expectedResult;

    public SumCalculatorTest(long firstNumber, long secondNumber, long expectedResult) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        });
    }

    @Test
    public void onePlusTwoTest() {
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result, expectedResult);
    }
}
