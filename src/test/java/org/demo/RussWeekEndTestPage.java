package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.russianweekend.WeekEndBookingPage;
import org.russianweekend.WeekEndHomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.yosemite.BaseClass;

public class RussWeekEndTestPage extends BaseClass{

	@BeforeClass
	private void launchUrl() {
		launchChromeBrowser();
		launchURL("https://bestbayareatours.com/");
		maxiWindow();
		impWait(10);
	}

	@BeforeMethod
	private void startTime() {
		getDateTime();
	}
	@Test
	private void tc3() throws InterruptedException {
		Thread.sleep(5000);

		WeekEndHomePage wh = new WeekEndHomePage();

		WebElement tours = wh.getTours();
		explicitWebDriverWait(50000, tours);
		movingCursor(tours);

		WebElement russianRiver = wh.getRussianRiver();
		clickElement(russianRiver);

		Thread.sleep(30000);

		WebElement bookNow = wh.getBookNow();
		clickElement(bookNow);

		Thread.sleep(30000);

		WebElement frames = wh.getFrames();
		switchToFrame(frames);

		Thread.sleep(30000);

		WebElement day = wh.getDay();
		clickElement(day);
	}
	@Test
	public void tc4() throws AWTException, InterruptedException {

		Thread.sleep(7000);

		WeekEndBookingPage wb = new WeekEndBookingPage();

		WebElement adults = wb.getAdults();
		Select s = new Select(adults);
		s.selectByValue("2");

		WebElement childs = wb.getChilds();
		Select s1 = new Select(childs);
		s1.selectByValue("1");

		WebElement wholePage = wb.getWholePage();
		clickElement(wholePage);

		for (int i = 0; i < 7; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(4000);

		WebElement ques1 = wb.getQues1();
		Select s3 = new Select(ques1);
		s3.selectByVisibleText("Abri Hotel");

		WebElement name = wb.getName();
		passValues(name, "Sasi123");

		WebElement flag = wb.getFlag();
		clickElement(flag);

		for (int i = 0; i < 100; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement phnNo = wb.getPhnNo();
		passValues(phnNo, "2341056701");

		WebElement geteMail = wb.geteMail();
		passValues(geteMail, "sasi@gmail.com");

		WebElement cardNo = wb.getCardNo();
		passValues(cardNo, "3123345667899012");

		Thread.sleep(7000);

		WebElement expMonth = wb.getExpMonth();
		movingCursor(expMonth);
		clickElement(expMonth);

		for (int i = 0; i < 5; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement expYear = wb.getExpYear();
		movingCursor(expYear);
		clickElement(expYear);

		for (int i = 0; i < 2; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cardName = wb.getCardName();
		passValues(cardName, "Sasi");

		WebElement cVC = wb.getcVC();
		passValues(cVC, "987");

		WebElement country = wb.getCountry();
		Select s6 = new Select(country);
		s6.selectByVisibleText("India");

		WebElement complete = wb.getComplete();
		clickElement(complete);
	}

	@AfterMethod
	private void endTime() {
		getDateTime();
	}

	@AfterClass
	private void close() {
		closeBrowser();
	}

}
