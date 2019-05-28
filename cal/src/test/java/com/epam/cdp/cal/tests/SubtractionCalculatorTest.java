package com.epam.cdp.cal.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionCalculatorTest extends BaseTest {
	
	@Test
	public void twoMinusOne() {
		long result = calculator.sub(2, 1);
		Assert.assertTrue(result == 1);
	}

	@Test(dataProvider = "valuesForDoubleSubTest")
	public void minusTest(double firstNumber, double secondNumber, double expectedValue) {
		double result = calculator.sub(firstNumber, secondNumber);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}

	@Test(dataProvider = "valuesForSubTest")
	public void minusTest(long firstNumber, long secondNumber, long expectedValue) {
		long result = calculator.sub(firstNumber, secondNumber);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}

	@DataProvider(name = "valuesForSubTest")
	public Object[][] valuesForSub() {
		return new Object[][] {
				{24, 18, 6},
				{10, 9, 1},
				{0, 0, 0},
				{8, 3, 5}
		};
	}
	@DataProvider(name = "valuesForDoubleSubTest")
	public static Object[][] data() {
		return (new Object[][]{
				{7, 1, 6.0},
				{6, 2, 4.0},
				{15, 5, 10.0},
				{14, 5, 9.0},
				{29, 9, 20.0}
		});
	}

}
