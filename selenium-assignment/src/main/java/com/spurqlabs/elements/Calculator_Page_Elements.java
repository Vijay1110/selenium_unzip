package com.spurqlabs.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator_Page_Elements {

	WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='0']") public WebElement key0;
	@FindBy(xpath="//span[normalize-space()='1']") public WebElement key1;
	@FindBy(xpath="//span[normalize-space()='2']") public WebElement key2;
	@FindBy(xpath="//span[normalize-space()='3']") public WebElement key3;
	@FindBy(xpath="//span[normalize-space()='4']") public WebElement key4;
	@FindBy(xpath="//span[normalize-space()='5']") public WebElement key5;
	@FindBy(xpath="//span[normalize-space()='6']") public WebElement key6;
	@FindBy(xpath="//span[normalize-space()='7']") public WebElement key7;
	@FindBy(xpath="//span[normalize-space()='8']") public WebElement key8;
	@FindBy(xpath="//span[normalize-space()='9']") public WebElement key9;
	
	@FindBy(xpath="//span[normalize-space()='×']") public WebElement multiply;
	@FindBy(xpath="//span[normalize-space()='/']") public WebElement divide;
	@FindBy(xpath="//span[normalize-space()='+']") public WebElement add;
	@FindBy(xpath="//span[normalize-space()='–']") public WebElement negative;
	
	@FindBy(xpath="//div[@id='sciOutPut']") public WebElement outputScreen;

	public Calculator_Page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
