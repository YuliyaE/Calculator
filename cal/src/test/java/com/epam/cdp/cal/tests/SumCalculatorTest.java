package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalculatorTest extends BaseTest {
	
	@Test(dataProvider = "valuesForSunTest")
	public void onePlusTwoTest(long a, long b, long expectedValue) {
		long result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}

	@Test(dataProvider = "valuesForSunTest")
	public void onePlusTwoTest(double a, double b, double expectedValue) {
		double result = calculator.sum(a, b);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}
	
	@DataProvider(name = "valuesForSunTest") 
	public Object[][] valuesForSum() {
		return new Object[][] {
			{10, 23, 33},
			{10, -1, 9},
			{0, 0, 0},
			{-1, 10, 9}
		};
	}



}
