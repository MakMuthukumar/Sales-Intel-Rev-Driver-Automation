package org.runner;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.base.Global;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.qameta.allure.Allure;

public class Before_And_After extends Global {

	@Before("@Validated_Salesforce_And_LinkedIn_Website")
	public void beforeExecutedClass(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
	}

	@After("@Validated_Salesforce_And_LinkedIn_Website")
	public void afterExecutedClass(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver_For_LinkedIn;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
			Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(screenshotAs));
		}
	}

	@Before("@Various_Region_India")
	public void beforeExecutedClassForVariousRegionIndia(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
	}

	@After("@Various_Region_India")
	public void afterExecutedClassForVariousRegionIndia(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver1;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
			Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(screenshotAs));
		}
	}

	@Before("@Various_Region_US")
	public void beforeExecutedClassForVariousRegionUS(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
	}

	@After("@Various_Region_US")
	public void afterExecutedClassForVariousRegionUS(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver2;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
			Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(screenshotAs));
		}
	}

	@Before("@Various_Region_UK")
	public void beforeExecutedClassForVariousRegionUK(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
	}

	@After("@Various_Region_UK")
	public void afterExecutedClassForVariousRegionUK(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver3;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
			Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(screenshotAs));
		}
	}

	@Before("@Customer_Details")
	public void beforeExecutedClassForCustomerDetails(Scenario scenario) {
		System.out.println("Scenario Name: " + scenario.getName());
	}

	@After("@Customer_Details")
	public void afterExecutedClassForCustomerDetails(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshotAs, "image/png");
			Allure.addAttachment(scenario.getName(), new ByteArrayInputStream(screenshotAs));
		}
	}

}
