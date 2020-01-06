package com.cucumber.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Table.Cell;
import com.sun.glass.events.KeyEvent;

import junit.framework.Assert;

public class SeleniumBaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) throws Throwable {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C://Users//divibharath//eclipse-workspace//MavenPractise//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "//Drivers//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				throw new Exception("Invalid browser name");
			}

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		} catch (Exception e) {

			e.printStackTrace();
			throw new Exception("Issue is browser launch");
		}
	}

	public static void ScrollToElement(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void getUrl(String url) throws Exception {
		try {
			driver.get(url);
		} catch (Exception e) {

			e.printStackTrace();
			throw new Exception("URL Is not valid");
		}
	}

	public static void inputValuesInElement(WebElement element, String value) {
		try {
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println(value + " couldnt be entered");
		}

	}

	public static void waitForElementVisiblity(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 10);
			wb.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void clickOnTheElement(WebElement element) {

		try {

			element.click();

		} catch (Exception e) {

			System.out.println("Couldnt be clicked");
		}

	}

	public static void mouseOver(WebElement element) {

		try {

			Actions ac = new Actions(driver);
			ac.moveToElement(element);

		} catch (Exception e) {

			System.out.println("Not moved to element");
		}
	}
	
	public void rightClickOnElement(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(element);
		} catch (Exception e) {
			System.out.println("Element couldnt be right clicked");
		}

	}
	
	public void keyboardMoveOneDown() throws Throwable {
		try {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("Couldnt use Keyboard action");
		}
		

	}

	// select using value from dd
	public static void selectFromDropDown(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}

	// get value of an attribute

	public static void getAttributeValue(WebElement element) {

		System.out.println(element.getAttribute("value"));

		// TODO Auto-generated method stub

	}

	public static void selectOptionInDD(WebElement element, String options, String values) throws Exception {
		waitForElementVisiblity(element);
		Select sc = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			sc.selectByIndex(Integer.parseInt(values));
		} else if (options.equalsIgnoreCase("value")) {
			sc.selectByValue(values);
		} else if (options.equalsIgnoreCase("visibletext")) {
			sc.selectByVisibleText(values);
		} else {
			throw new Exception("Not a valid options");

		}

	}

	// text to int
	public static int GetttingTextFromElementToInt(WebElement element) {
		int i = 0;
		String s = element.getText();
		if (s.contains("₹")) {
			s = s.replace("₹", "");
		}
		if (s.contains(",")) {
			s = s.replace(",", "");
		}
		i = Integer.parseInt(s);
		return i;

	}

	// just getText
	public static String GetttingTextFromElement(WebElement element) {

		String s = element.getText();

		return s;

	}
	// pop up

	public static void HandlePopUp(WebElement element) {

		Alert a = driver.switchTo().alert();
		a.accept();

	}

	public static void scrollToPageHeight(String options) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (options.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		} else if (options.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		} else {
			throw new Exception("Not a valid option");
		}
	}

	public static void scrollUsingCoordinates(int width, int height) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + width + "," + height + ")");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void validationOfText(String x, String y) {
		try {
			if (x.equalsIgnoreCase(y))
				System.out.println("The value " + y + " has been successfully entered");
			else {
				System.out.println("The value " + y + " has not been successfully entered");
				throw new Exception("Values" + x + y + "are not same");
			}
		} catch (Exception e) {
			System.out.println("Exception from validationOfText Method");
		}

	}

	public static void takeScreenShot(String filename) throws Throwable {

		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(System.getProperty(
					"C:\\Users\\divibharath\\eclipse-workspace\\Selenium\\FileScreenshot" + filename + ".png"));
			FileUtils.copyFile(temp, des);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public static void switchToWindows(String pageTitle) {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String x : windowHandles) {
			driver.switchTo().window(x);
			String title = driver.getTitle();
			if (title.equals(pageTitle)) {
				Assert.assertTrue(true);
			} else {
				Assert.fail("Title is mismatched");
			}
		}

	}

	public static void switchToWindows(int index) throws Exception {
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> li = new ArrayList<String>();
			li.addAll(windowHandles);
			String winID = li.get(index);
			driver.switchTo().window(winID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception();
		}

	}

	public static String getExcelData(String sheet, int row, int cell) throws Throwable {

		String x = null;
		try {
			File f = new File("C:Users/divibharath/eclipse-workspace/MavenPractise/Excel/FacebookLogin.xlsx");
			FileInputStream f1 = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(f1);
			org.apache.poi.ss.usermodel.Sheet sheet1 = w.getSheet(sheet);
			int rowCount = sheet1.getPhysicalNumberOfRows();
			// System.out.println(rowCount);
			Row row1 = sheet1.getRow(row);
			org.apache.poi.ss.usermodel.Cell cell1 = row1.getCell(cell);

			switch (cell1.getCellType()) {
			case NUMERIC:
				double d = cell1.getNumericCellValue();
				int a = (int) d;
				x = String.valueOf(a);
				System.out.println(x);
				break;

			case STRING:
				x = cell1.getStringCellValue();
				System.out.println(x);
				break;
			}
		} catch (Exception e) {
			throw new Exception("Problem in getting data from Excel");
		}
		return x;
	}

	public static String getExcelDataUsingMap(String sheet, int row, String mapKey) throws Throwable {
		String x = null, s1 = null;
		try {
			List<HashMap<String, String>> mapList = new ArrayList<HashMap<String, String>>();
			File f = new File("C:\\Users\\divibharath\\eclipse-workspace\\MavenPractise\\Excel\\AdactinJunitExcel.xlsx");
			FileInputStream f1 = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(f1);
			org.apache.poi.ss.usermodel.Sheet sheet1 = w.getSheet(sheet);
			int rowCount = sheet1.getPhysicalNumberOfRows();
			// System.out.println(rowCount);
			Row row1 = sheet1.getRow(row);
			Row headerRow = sheet1.getRow(0);
			for (int i = 1; i < sheet1.getPhysicalNumberOfRows(); i++) {
				Row row2 = sheet1.getRow(i);
				// System.out.println(row2.getPhysicalNumberOfCells());
				HashMap<String, String> mapData = new HashMap<String, String>();
				for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
					org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(j);

					switch (cell2.getCellType()) {
					case NUMERIC:
						double d = cell2.getNumericCellValue();
						long a = (long) d;
						mapData.put(headerRow.getCell(j).getStringCellValue(), String.valueOf(a));
						break;

					case STRING:
						x = cell2.getStringCellValue();
						mapData.putIfAbsent(headerRow.getCell(j).getStringCellValue(), x);
						break;
					}
					mapList.add(mapData);

				}

			}
			List<HashMap<String, String>> x1 = mapList;
			HashMap<String, String> hashMap = x1.get(row);
			s1 = hashMap.get(mapKey);
			System.out.println(s1);

		} catch (Exception e) {
			throw new Exception("Problem in getting data from Excel");
		}
		return s1;
	}

	public static void writeToExcel(String sheet, int row, int cellnum, String cellValue) throws Throwable {

		File f = new File("C:\\Users\\divibharath\\eclipse-workspace\\MavenPractise\\Excel\\FacebookLogin.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		org.apache.poi.ss.usermodel.Sheet sheet1 = w.getSheet(sheet);
		Row row1 = sheet1.createRow(row);
		row1.createCell(cellnum).setCellValue(cellValue);
		f1.close();
		FileOutputStream f2 = new FileOutputStream(f);
		w.write(f2);
		w.close();
		System.out.println(cellValue + " Written in Excel sheet");
	}
	
	public List addToList(String string) {
		List<String> li=new ArrayList<String>();
		li.add(string);
		return li;
	}

}
 