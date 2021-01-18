package com.spurqlabs.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator_test extends AbstractBaseTest {

		
	@Test()
	public void multiplication() throws Exception {
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);

		theCalculator_Page.click4();
		theCalculator_Page.click2();
		theCalculator_Page.click3();
		theCalculator_Page.clickMultiply();
		theCalculator_Page.click5();
		theCalculator_Page.click2();
		theCalculator_Page.click5();

		int ans = Integer.parseInt(theCalculator_Page.getResult().strip());
		Assert.assertEquals(ans, 423 * 525, "Verify ans of multiplication");

	}

	@Test(dependsOnMethods = { "multiplication" })
	public void division() throws Exception {
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);

		theCalculator_Page.click4();
		theCalculator_Page.click0();
		theCalculator_Page.click0();
		theCalculator_Page.click0();
		theCalculator_Page.clickDivide();
		theCalculator_Page.click2();
		theCalculator_Page.click0();
		theCalculator_Page.click0();

		int ans = Integer.parseInt(theCalculator_Page.getResult().strip());
		Assert.assertEquals(ans, 4000 / 200, "Verify ans of addition");

	}

	@Test(dependsOnMethods = { "multiplication", "division" })
	public void addition() throws Exception {
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);

		theCalculator_Page.clickNegative();
		theCalculator_Page.click2();
		theCalculator_Page.click3();
		theCalculator_Page.click4();
		theCalculator_Page.click2();
		theCalculator_Page.click3();
		theCalculator_Page.click4();
		theCalculator_Page.clickPlus();
		theCalculator_Page.click3();
		theCalculator_Page.click4();
		theCalculator_Page.click5();
		theCalculator_Page.click3();
		theCalculator_Page.click4();
		theCalculator_Page.click5();

		int ans = Integer.parseInt(theCalculator_Page.getResult().strip());
		Assert.assertEquals(ans, -234234 + 345345, "Verify ans of addition");
	}

	@Test(dependsOnMethods = { "multiplication", "division", "addition" })
	public void subtraction() throws Exception {
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);

		theCalculator_Page.click2();
		theCalculator_Page.click3();
		theCalculator_Page.click4();
		theCalculator_Page.click8();
		theCalculator_Page.click2();
		theCalculator_Page.click3();
		theCalculator_Page.clickNegative();
		theCalculator_Page.click2();
		theCalculator_Page.click3();
		theCalculator_Page.click0();
		theCalculator_Page.click9();
		theCalculator_Page.click4();
		theCalculator_Page.click8();
		theCalculator_Page.click2();
		theCalculator_Page.click3();

		int ans = Integer.parseInt(theCalculator_Page.getResult().strip());
		Assert.assertEquals(ans, 234823 - 23094823, "Verify ans of addition");

	}
}
