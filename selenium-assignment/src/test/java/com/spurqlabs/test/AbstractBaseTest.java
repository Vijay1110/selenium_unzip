package com.spurqlabs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.spurqlabs.pages.Calculator_Page;

public class AbstractBaseTest {

	WebDriver driver;
	Calculator_Page theCalculator_Page;

	@Parameters({ "browser", "driverexe" })
	@BeforeTest
	public void setUp(@Optional("Chrome") String browser,
			@Optional("D:/selenium web driver/chromedriver.exe") String driverexe) throws Exception {

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverexe);
			driver = new ChromeDriver();
		} else if (browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", driverexe);
			driver = new FirefoxDriver();
		}

		theCalculator_Page = new Calculator_Page(driver);
	}

	@AfterTest
	public void setDown() {
		driver.close();
	}
}
