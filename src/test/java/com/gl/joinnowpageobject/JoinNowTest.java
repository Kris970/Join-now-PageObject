package com.gl.joinnowpageobject;


import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JoinNowTest {
	WebDriver driver;
	JoinNowPage joinNowPage;

	@BeforeMethod
	public void JoinNow() {

		MainPage mainPage = new MainPage(driver);
		mainPage.load();
		
		joinNowPage = mainPage.pressJoinNow();
		
	}

	@BeforeTest
	public void init() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void testUsernameError() {

		joinNowPage.fillFullName("test");
		joinNowPage.fillUsername("xcv");
		joinNowPage.fillPassword("123456");
		joinNowPage.fillConfPass("123456");
		joinNowPage.fillEmail("test@yhg.biz");
		joinNowPage.fillMobile("+380686868");
		joinNowPage.pressJoin();
		
		
		MatcherAssert.assertThat("Username Error wrong", joinNowPage.getUsernameError(), equalTo("Username length must be between 6 and 32"));
	}
	@Test
	public void testEmailError() {

		joinNowPage.fillFullName("test");
		joinNowPage.fillUsername("test.test56");
		joinNowPage.fillPassword("123456");
		joinNowPage.fillConfPass("123456");
		joinNowPage.fillEmail("nymgo@yhg.biz");
		joinNowPage.fillMobile("+380686868");
		joinNowPage.pressJoin();
		
		
		MatcherAssert.assertThat("Email Error wrong", joinNowPage.getEmailError(), equalTo("Cannot use: nymgo, splendor, ahwar, callback, free, voip"));
	}
	@Test
	public void testMobileError() {

		joinNowPage.fillFullName("test");
		joinNowPage.fillUsername("test.test56");
		joinNowPage.fillPassword("123456");
		joinNowPage.fillConfPass("123456");
		joinNowPage.fillEmail("usertest@yhg.biz");
		joinNowPage.fillMobile("ad");
		joinNowPage.pressJoin();
		
		
		MatcherAssert.assertThat("Email Error wrong", joinNowPage.getMobileError(), equalTo("Mobile is invalid pattern"));
	}

}
