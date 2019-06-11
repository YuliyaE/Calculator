package com.epam.cdp.cal.tests.testng;

import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;

import java.util.Date;

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

	@BeforeSuite
	public void setUpSuite(){
		calculator = new Calculator();
	}


	@BeforeGroups("trigonometry")
	public void setUpGroups() {
		calculator = new Calculator();
		System.out.println("Start of group");
	}

	@AfterGroups("trigonometry")
	public void tearDownGroup() {
			System.out.println("End of group");
	}

	protected void checkTime() {
		System.out.println("Current time: " + new Date(System.currentTimeMillis()));
	}

}
