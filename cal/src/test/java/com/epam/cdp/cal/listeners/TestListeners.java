package com.epam.cdp.cal.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;


public class TestListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {		
		System.out.println("on Test Success: " + result.getName());
	}

	public void onTestFailure(ITestResult result){
	    saveScreenshots();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context)  {

	}


	public void saveScreenshots() {

        try {
			Date date = new Date();
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(image, "png", new File(".//target/screenshots/" + date.getTime() + ".png"));
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
