package org.demo;

import java.awt.event.KeyEvent;

import org.giftcerti.CertiBookingPage;
import org.giftcerti.CertiHomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.yosemite.BaseClass;

public class GiftCertiTestPage extends BaseClass{

	@BeforeSuite
	private void launchBrowser() {
		launchChromeBrowser();
	}

	@BeforeClass
	private void launchUrl() {
		launchURL("https://bestbayareatours.com/");
		maxiWindow();
		impWait(10);
	}

	@BeforeMethod
	private void startTime() {
		getDateTime();
	}

	@Test
	private void tc11() throws InterruptedException {
		Thread.sleep(5000);

		CertiHomePage ch = new CertiHomePage();

		WebElement bookNow = ch.getBookNow();
		explicitWebDriverWait(50000, bookNow);        
		clickElement(bookNow);

		Thread.sleep(50000);

		WebElement certiBuy = ch.getCertiBuy();
		scrollToEle(certiBuy);
		explicitWebDriverWait(30000, certiBuy);
		clickElement(certiBuy);

		Thread.sleep(30000);

		WebElement frames = ch.getFrames();
		switchToFrame(frames);

		Thread.sleep(30000);

		WebElement buyNow = ch.getBuyNow();
		clickElement(buyNow);        
	}

	@Test
	public void tc12() throws InterruptedException {

		Thread.sleep(7000);

		CertiBookingPage cb = new CertiBookingPage();

		WebElement adults = cb.getSauAdult();
		Select s = new Select(adults);
		s.selectByValue("2");

		WebElement childs = cb.getSauChild();
		Select s1 = new Select(childs);
		s1.selectByValue("1");

		WebElement wholePage = cb.getWholePage();
		clickElement(wholePage);

		for (int i = 0; i < 30; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(8000);

		WebElement name = cb.getFullName();
		passValues(name, "Sasi123");

		WebElement phnNo = cb.getPhnNo();
		passValues(phnNo, "2341056701");

		WebElement geteMail = cb.geteMail();
		passValues(geteMail, "sasi@gmail.com");

		WebElement cardNo = cb.getCardNo();
		passValues(cardNo, "3123345667899012");

		Thread.sleep(7000);

		WebElement expMonth = cb.getExpMonth();
		movingCursor(expMonth);
		clickElement(expMonth);

		for (int i = 0; i < 5; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement expYear = cb.getExpYear();
		movingCursor(expYear);
		clickElement(expYear);

		for (int i = 0; i < 2; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement cardName = cb.getCardName();
		passValues(cardName, "Sasi");

		WebElement cVC = cb.getcVC();
		passValues(cVC, "987");

		WebElement country = cb.getCountry();
		Select s6 = new Select(country);
		s6.selectByVisibleText("India");

		WebElement complete = cb.getComplete();
		clickElement(complete);
	}

	@AfterMethod
	private void endTime() {
		getDateTime();
	}

	@AfterClass
	private void close() {
		System.out.println("Close the Browser");
	}


}

