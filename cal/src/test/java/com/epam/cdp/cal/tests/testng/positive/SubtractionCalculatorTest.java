package com.epam.cdp.cal.tests.testng.positive;

import com.epam.cdp.cal.tests.testng.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionCalculatorTest extends BaseTest {

	@Test(dataProvider = "valuesForDoubleSubtractionTest")
	public void testSubtraction(double firstNumber, double secondNumber, double expectedValue) {
		double result = calculator.sub(firstNumber, secondNumber);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}

	@Test(dataProvider = "valuesForSubtractionTest")
	public void testSubtraction(long firstNumber, long secondNumber, long expectedValue) {
		long result = calculator.sub(firstNumber, secondNumber);
		Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
	}

	@DataProvider(name = "valuesForSubtractionTest")
	public Object[][] valuesForSubtraction() {
		return new Object[][] {
				{24, 18, 6},
				{10, 9, 1},
				{0, 0, 0},
				{8, 3, 5}
		};
	}
	@DataProvider(name = "valuesForDoubleSubtractionTest")
	public static Object[][] dataForDoubleSubtraction() {
		return (new Object[][]{
				{7, 1, 6.0},
				{6, 2, 4.0},
				{15, 5, 10.0},
				{14, 5, 9.0},
				{29, 9, 20.0}
		});
	}

}
