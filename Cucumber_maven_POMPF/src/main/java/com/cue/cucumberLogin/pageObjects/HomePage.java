package com.cue.cucumberLogin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href, 'mail.google.com')]")
	private WebElement link_mail;

	@FindBy(xpath = "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
	private WebElement link_signIn;

	public void navigateTo_HomePage() {
		driver.get("https://www.google.com");
	}
	
	public void clickLink_mail() {
		link_mail.click();
	}

	public void clickLink_signIn() {
		link_signIn.click();
	}
}
