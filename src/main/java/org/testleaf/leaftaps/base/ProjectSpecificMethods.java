package org.testleaf.leaftaps.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testleaf.leaftaps.utils.ReadExcel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public String excelFileName;

	
	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse project\\LearnSelenium\\drivers\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@DataProvider(name="fetchData")
	public Object[][] dataCentre() throws IOException {
		return ReadExcel.readData(excelFileName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
