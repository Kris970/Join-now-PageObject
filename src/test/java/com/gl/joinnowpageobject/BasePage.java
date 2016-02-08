package com.gl.joinnowpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriver getDriver() {
		return driver;
	}
  public void load (String url) {
	  driver.navigate().to(url);
	  
	  
  }
}
