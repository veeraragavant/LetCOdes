package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseclass;

public class SigninPage extends baseclass{

	public SigninPage(WebDriver driver) {
		//this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "sign_in_username")
	public WebElement usernme;
	
	@FindBy(id = "sign_in_username_btn")
	public WebElement btn;
	
	@FindBy(id = "sign_in_password")
	public WebElement pswrd;
	
	@FindBy(id = "sign_in_password_btn")
	public WebElement pswdbtn;
	
	@FindBy(id = "fruits")
	public WebElement fruits;
	
	@FindBy(id = "superheros")
	public WebElement heroes;
}
