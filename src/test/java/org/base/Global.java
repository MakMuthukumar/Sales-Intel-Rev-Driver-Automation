package org.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Global {
	public static WebDriver driver, driver1, driver2, driver3, driver_For_LinkedIn;
	public static ChromeOptions chromeOptions;
	public static Screen screen;
	public static FileReader fileReader;
	public static JSONParser jsonParser;

	public static WebDriver getDriver(String fileName) throws Throwable {

		WebDriverManager.chromedriver().setup();
		chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\CRX_File_Store\\4.7_0.crx"));
		driver = new ChromeDriver(chromeOptions);
		driver.get(fileName);

		return driver;
	}

	public static WebDriver getDriverIndianRegion(String fileName) throws Throwable {
		WebDriverManager.chromedriver().setup();
		chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\CRX_File_Store\\4.7_0.crx"));
		driver1 = new ChromeDriver(chromeOptions);
		driver1.get(fileName);

		return driver1;
	}

	public static WebDriver getDriverUSRegion(String fileName) throws Throwable {
		WebDriverManager.chromedriver().setup();
		chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\CRX_File_Store\\4.7_0.crx"));
		driver2 = new ChromeDriver(chromeOptions);
		driver2.get(fileName);
		return driver2;
	}

	public static WebDriver getDriverUSRegionForLinkedIn(String fileName) throws Throwable {
		WebDriverManager.chromedriver().setup();
		chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\CRX_File_Store\\4.7_0.crx"));
		chromeOptions.addArguments("--disable-notifications");
		driver_For_LinkedIn = new ChromeDriver(chromeOptions);
		driver_For_LinkedIn.get(fileName);

		return driver_For_LinkedIn;
	}

	public static WebDriver getDriverUKRegion(String fileName) throws Throwable {
		WebDriverManager.chromedriver().setup();
		chromeOptions = new ChromeOptions();
		chromeOptions.addExtensions(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\CRX_File_Store\\4.7_0.crx"));
		driver3 = new ChromeDriver(chromeOptions);
		driver3.get(fileName);

		return driver3;
	}

	public static void enterData(WebElement webElement, String data) {
		webElement.sendKeys(data);
	}

	public static void clickButton(WebElement webElement) {
		webElement.click();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void implicitWaitIndianRegion() {
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void implicitWaitUSRegion() {
		driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void implicitWaitUSRegionForLinkedIn() {
		driver_For_LinkedIn.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void implicitWaitUKRegion() {
		driver3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void maximizeWindowIndianRegion() {
		driver1.manage().window().maximize();
	}

	public static void maximizeWindowUSRegion() {
		driver2.manage().window().maximize();
	}

	public static void maximizeWindowUSRegionForLinkedIn() {
		driver_For_LinkedIn.manage().window().maximize();
	}

	public static void maximizeWindowUKRegion() {
		driver3.manage().window().maximize();
	}

	public static void launchURL(String url) {
		driver.get(url);
	}

	public static void generateJVMReport(String jsonFile) {
		Configuration configuration = new Configuration(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\CucumberReports"),
				"SalesIntel RevDriver Automation Testing");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("OS Name", System.getProperty("os.name"));
		try {
			configuration.addClassifications("Host Name", InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

	public static void sikuliClickOnScreenObjects(String fileName) {
		screen = new Screen();
		Pattern pattern = new Pattern(fileName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			screen.wait(pattern, 20);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			screen.click(pattern);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void sikuliTypeOnScreenObjects(String fileName, String enterData) {
		screen = new Screen();
		Pattern pattern = new Pattern(fileName);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			screen.wait(pattern, 20);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			screen.type(pattern, enterData);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void waitForPageLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String retrieveDataFromJson(String fileName, String jsonRootData, String jsonObjectData)
			throws IOException, ParseException {
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) parse;
		Object object = jsonObject.get(jsonRootData);

		JSONObject jsonObject2 = (JSONObject) object;
		return jsonObject2.get(jsonObjectData).toString();

	}

	public static String retrieveJsonObjectFromJsonFile(String fileName, String jsonObjectData)
			throws IOException, ParseException {
		try {
			fileReader = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);

		JSONObject jsonObject1 = (JSONObject) parse;
		return jsonObject1.get(jsonObjectData).toString();

	}

	public static void getWindowHandleForMultipleWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		List<String> list = new ArrayList<String>();
		list.addAll(allWindows);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getWindowHandle());
//		for (String eachWindows : allWindows) {
//			if(eachWindows.equalsIgnoreCase("Revdriver")) {
//				driver.switchTo().window(eachWindows);
//				System.out.println(driver.getTitle());
//			}
//		}

	}

	public static void switchToParentWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindows : allWindows) {
			if (parentWindow.contains(eachWindows)) {
				driver.switchTo().window(parentWindow);
			}
		}
	}

}
