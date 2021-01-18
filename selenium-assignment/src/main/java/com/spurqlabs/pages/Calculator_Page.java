package com.spurqlabs.pages;

import org.openqa.selenium.WebDriver;

import com.spurqlabs.elements.Calculator_Page_Elements;

public class Calculator_Page {

	WebDriver driver;
	Calculator_Page_Elements theCalculator_Page_Elements;

	public Calculator_Page(WebDriver driver) {
		this.driver = driver;
		theCalculator_Page_Elements = new Calculator_Page_Elements(driver);
	}

	public void clickMultiply() {
		theCalculator_Page_Elements.multiply.click();
	}

	public void clickDivide() {
		theCalculator_Page_Elements.divide.click();
	}

	public void clickPlus() {
		theCalculator_Page_Elements.add.click();
	}

	public void clickNegative() {
		theCalculator_Page_Elements.negative.click();
	}

	public void click0() {
		theCalculator_Page_Elements.key0.click();
	}

	public void click1() {
		theCalculator_Page_Elements.key1.click();
	}

	public void click2() {
		theCalculator_Page_Elements.key2.click();
	}

	public void click3() {
		theCalculator_Page_Elements.key3.click();
	}

	public void click4() {
		theCalculator_Page_Elements.key4.click();
	}

	public void click5() {
		theCalculator_Page_Elements.key5.click();
	}

	public void click6() {
		theCalculator_Page_Elements.key6.click();
	}

	public void click7() {
		theCalculator_Page_Elements.key7.click();
	}

	public void click8() {
		theCalculator_Page_Elements.key8.click();
	}

	public void click9() {
		theCalculator_Page_Elements.key9.click();
	}

	public String getResult() {
		return theCalculator_Page_Elements.outputScreen.getText();
	}
}
