package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
 
	//Page Factory
	@FindBy(xpath="//span[@class='b_a aa_b b_g b_b b_p w_a w_h w_i' and text()='Account']")
	WebElement AccountLink;
	
	
	@FindBy(name="email")
	WebElement username;
	
    @FindBy(name="password")
	WebElement password;
	
    @FindBy(xpath="//*[@id=\"sign-in-form\"]/button[1]")
	WebElement loginBtn;
	
    @FindBy(xpath="//span[contains(@class,'spark elc-icon elc-icon-spark elc-icon-36')]")
	WebElement walmartLogo;
    
    
    
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public boolean validateWalmartImage() {
		return walmartLogo.isDisplayed();
		
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
