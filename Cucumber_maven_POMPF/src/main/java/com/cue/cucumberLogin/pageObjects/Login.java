package com.cue.cucumberLogin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElement txtbox_user;

	@FindBy(xpath = "//div[@id='identifierNext']")
	private WebElement btn_userSubmit;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtbox_pass;

	@FindBy(xpath = "//div[@id='passwordNext']")
	private WebElement btn_passSubmit;

	@FindBy(xpath = "//*[text()[contains(.,'Wrong password')]]")
	private WebElement txt_message;

	public void enter_user(String uname) {
		txtbox_user.sendKeys(uname);
	}

	public void click_user_next() {
		btn_userSubmit.click();
	}

	public void enter_pass(String pass) {
		txtbox_pass.sendKeys(pass);
	}

	public void click_pass_next() {
		btn_passSubmit.click();
	}

	public void getMessage() {
		String message = txt_message.getText();
		System.out.println("Message :" + message);
	}
}
