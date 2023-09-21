package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.yosemite.BaseClass;
import org.yosemite.BookingPage;
import org.yosemite.HomePage;

public class YosemiteTestPage extends BaseClass{

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
	public void tc9() throws InterruptedException, AWTException {
		HomePage h =new HomePage();

		WebElement tours = h.getTours();
		movingCursor(tours);

		WebElement yosemite = h.getYosemite();
		clickElement(yosemite);

		WebElement bookNow = h.getBookNow();
		clickElement(bookNow);

		WebElement frames = h.getFrames();	
		impWait(20);
		switchToFrame(frames);

		WebElement day = h.getDay();
		impWait(20);
		clickElement(day);	
		
		Thread.sleep(5000);
	
		BookingPage b = new BookingPage();		
		
		WebElement adults = b.getAdults();
		Thread.sleep(5000);
		Select s = new Select(adults);
		s.selectByValue("1");

		WebElement childs = b.getChilds();
		Select s1 = new Select(childs);
		s1.selectByValue("1");

		WebElement wholePage = b.getWholePage();
		clickElement(wholePage);

		for (int i = 0; i < 7; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(4000);

		WebElement ques1 = b.getQues1();
		Select s2 = new Select(ques1);
		s2.selectByVisibleText("TripAdvisor");

		WebElement ques2 = b.getQues2();
		Select s3 = new Select(ques2);
		s3.selectByVisibleText("Abri Hotel");

		WebElement ques3 = b.getQues3();
		passValues(ques3, "India");

		WebElement name = b.getName();
		passValues(name, "Sasi123");

		WebElement flag = b.getFlag();
		clickElement(flag);

		for (int i = 0; i < 100; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement phnNo = b.getPhnNo();
		passValues(phnNo, "2341056701");

		WebElement geteMail = b.geteMail();
		passValues(geteMail, "sasi@gmail.com");

		WebElement cardNo = b.getCardNo();
		passValues(cardNo, "3123345667899012");

		Thread.sleep(7000);

		WebElement expMonth = b.getExpMonth();
		movingCursor(expMonth);
		clickElement(expMonth);

		for (int i = 0; i < 5; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement expYear = b.getExpYear();
		movingCursor(expYear);
		clickElement(expYear);

		for (int i = 0; i < 2; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cardName = b.getCardName();
		passValues(cardName, "Sasi");

		WebElement cVC = b.getcVC();
		passValues(cVC, "987");

		WebElement country = b.getCountry();
		Select s6 = new Select(country);
		s6.selectByVisibleText("India");

		WebElement complete = b.getComplete();
		clickElement(complete);
	}

	@AfterMethod
	private void endTime() {
		getDateTime();
	}

	@AfterClass
	private void close() {
		System.out.println("close browser");
		//closeBrowser();
	}
}
