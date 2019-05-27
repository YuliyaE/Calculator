package com.epam.cdp.cal.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

public class BaseTest {
	
	protected Calculator calculator;

	@BeforeClass
	public void setUp() {
		calculator = new Calculator();
	}
	
	@AfterClass
	public void tearDown() {
		calculator = null;
	}

}
