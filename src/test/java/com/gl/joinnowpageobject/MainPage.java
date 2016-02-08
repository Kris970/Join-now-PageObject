package com.gl.joinnowpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

	private static final String BTN_JOIN_NOW = ".//*[@id='owl-example5']//a[@class = 'join']";
	private static final String JOIN_BUTTON = ".//*[@id='send-btn-el']";

	public MainPage(WebDriver driver) {
		super(driver);

	}

	public void load() {

		super.load("http://nymgo.com/");
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(BTN_JOIN_NOW)));
	}

	public JoinNowPage pressJoinNow() {
		WebElement btnJoinNow = getJoinNowbtn();
		btnJoinNow.click();
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(JOIN_BUTTON)));
		return new JoinNowPage(getDriver());

	}

	private WebElement getJoinNowbtn() {
		WebElement btnJoinNow = getDriver().findElement(By.xpath(BTN_JOIN_NOW));
		return btnJoinNow;
	}
	

}
