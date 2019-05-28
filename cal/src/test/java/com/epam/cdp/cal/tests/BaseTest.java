package com.epam.cdp.cal.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeGroups;

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

	@BeforeGroups("trigonometry")
	public void setUpGroups() {
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
