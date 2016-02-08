package com.gl.joinnowpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JoinNowPage extends BasePage {

	private static final String MOBILE_ERROR = ".//*[@id='mobile']/div/div";
	private static final String EMAIL_ERROR = ".//*[@id='Email']/div/div";
	private static final String USERNAME_ERROR = ".//*[@id='Username-Email']/div/div";
	private static final String JOIN_BUTTON = ".//*[@id='send-btn-el']";
	private static final String MOBILE_FIELD = ".//*[@id='mobile-el']";
	private static final String EMAIL_FIELD = ".//*[@id='Email-el']";
	private static final String CONF_PASSWORD_FIELD = ".//*[@id='Password-el' and @name = 'confirm_password'] ";
	private static final String PASSWORD_FIELD = ".//*[@id='Password-el' and @name = 'password']";
	private static final String USERNAME_FIELD = ".//*[@id='Username-Email-el']";
	private static final String FULL_NAME_FIELD = ".//*[@id='full_name-el']";

	public JoinNowPage(WebDriver driver) {
		super(driver);

	}

	private WebElement getFullName() {
		WebElement inFullName = getDriver().findElement(By.xpath(FULL_NAME_FIELD));
		return inFullName;
	}

	private WebElement getUsername() {
		WebElement inUsername = getDriver().findElement(By.xpath(USERNAME_FIELD));
		return inUsername;
	}

	private WebElement getPassword() {
		WebElement inPassword = getDriver().findElement(By.xpath(PASSWORD_FIELD));
		return inPassword;
	}

	private WebElement getConfPass() {
		WebElement inConfPass = getDriver().findElement(By.xpath(CONF_PASSWORD_FIELD));
		return inConfPass;
	}

	private WebElement getEmail() {
		WebElement inEmail = getDriver().findElement(By.xpath(EMAIL_FIELD));
		return inEmail;
	}

	private WebElement getMobile() {
		WebElement inMobile = getDriver().findElement(By.xpath(MOBILE_FIELD));
		return inMobile;
	}

	private WebElement getJoinbtn() {
		WebElement btnJoin = getDriver().findElement(By.xpath(JOIN_BUTTON));
		return btnJoin;
	}

	public void pressJoin() {
		getJoinbtn().click();
	}

	public void fillFullName(String text) {
		getFullName().sendKeys(text);

	}

	public void fillUsername(String text) {
		getUsername().sendKeys(text);

	}

	public void fillPassword(String text) {
		getPassword().sendKeys(text);

	}

	public void fillConfPass(String text) {
		getConfPass().sendKeys(text);

	}

	public void fillEmail(String text) {
		getEmail().sendKeys(text);

	}

	public void fillMobile(String text) {
		getMobile().sendKeys(text);

	}

	public String getUsernameError() {
		WebElement usernameError = getDriver().findElement(By.xpath(USERNAME_ERROR));
		return usernameError.getText();

	}
	public String getEmailError() {
		WebElement emailError = getDriver().findElement(By.xpath(EMAIL_ERROR));
		return emailError.getText();

	}
	public String getMobileError() {
		WebElement mobileError = getDriver().findElement(By.xpath(MOBILE_ERROR));
		return mobileError.getText();

	}
}
