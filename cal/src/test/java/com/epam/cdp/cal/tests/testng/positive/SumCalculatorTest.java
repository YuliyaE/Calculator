package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalculatorTest extends BaseTest {
	
	@Test(dataProvider = "valuesForSumTest", groups = "trigonometry")
	public void testSum(long firstNumber, long secondNumber, long expectedValue){
		long result = calculator.sum(firstNumber, secondNumber);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}

	@Test(dataProvider = "valuesForSumTest")
	public void testDoubleSum(double a, double b, double expectedValue) {
		double result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}
	
	@DataProvider(name = "valuesForSumTest")
	public Object[][] valuesForSumTest() {
		return new Object[][] {
			{10, 23, 33},
			{10, -1, 9},
			{0, 0, 0},
			{-1, 10, 9}
		};
	}



}
