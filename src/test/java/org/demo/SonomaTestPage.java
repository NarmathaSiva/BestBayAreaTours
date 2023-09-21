package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sonoma.SoBookingPage;
import org.sonoma.SoHomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.yosemite.BaseClass;

public class SonomaTestPage extends BaseClass{
	
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
	private void tc7() throws InterruptedException {
		SoHomePage sh =new SoHomePage();

		WebElement tours = sh.getTours();
		movingCursor(tours);

		WebElement sonoma = sh.getSonoma();
		clickElement(sonoma);

		WebElement bookNow = sh.getBookNow();
		clickElement(bookNow);
		
		Thread.sleep(5000);
		WebElement frames = sh.getFrames();	
		switchToFrame(frames);
		
		Thread.sleep(5000);
		
		WebElement day = sh.getDay();
		clickElement(day);
	}

	@Test
	public void tc8() throws AWTException, InterruptedException {
		
		Thread.sleep(7000);
		
		SoBookingPage sb = new SoBookingPage();

		WebElement adults = sb.getAdults();
		Select s = new Select(adults);
		s.selectByValue("2");

		WebElement childs = sb.getChilds();
		Select s1 = new Select(childs);
		s1.selectByValue("1");

		WebElement wholePage = sb.getWholePage();
		clickElement(wholePage);

		for (int i = 0; i < 7; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
        Thread.sleep(4000);
        
		WebElement ques1 = sb.getQues1();
		Select s2 = new Select(ques1);
		s2.selectByVisibleText("TripAdvisor");

		WebElement ques2 = sb.getQues2();
		Select s3 = new Select(ques2);
		s3.selectByVisibleText("Abri Hotel");

		WebElement ques3 = sb.getQues3();
		passValues(ques3, "India");

		WebElement name = sb.getName();
		passValues(name, "Sasi123");

		WebElement flag = sb.getFlag();
		clickElement(flag);

		for (int i = 0; i < 100; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement phnNo = sb.getPhnNo();
		passValues(phnNo, "2341056701");

		WebElement geteMail = sb.geteMail();
		passValues(geteMail, "sasi@gmail.com");

		WebElement cardNo = sb.getCardNo();
		passValues(cardNo, "3123345667899012");
		
		Thread.sleep(7000);

		WebElement expMonth = sb.getExpMonth();
		movingCursor(expMonth);
		clickElement(expMonth);
		
		for (int i = 0; i < 5; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);

		WebElement expYear = sb.getExpYear();
		movingCursor(expYear);
		clickElement(expYear);
		
		for (int i = 0; i < 2; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cardName = sb.getCardName();
		passValues(cardName, "Sasi");

		WebElement cVC = sb.getcVC();
		passValues(cVC, "987");

		WebElement country = sb.getCountry();
		Select s6 = new Select(country);
		s6.selectByVisibleText("India");

		WebElement complete = sb.getComplete();
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
