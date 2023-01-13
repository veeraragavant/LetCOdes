package POM;

import org.openqa.selenium.WebDriver;

import BaseClass.baseclass;
import Locators.Fashion;
import Locators.SigninPage;

public class Pom extends baseclass{

	public Pom(WebDriver driver) {
		this.driver=driver;
	}
	
	private SigninPage firstpg;

	public SigninPage getFirstpg() {
		if (firstpg==null) {
			firstpg=new SigninPage(driver);
		}
		return firstpg;
	}
	
	private Fashion fashion;

	public Fashion getFashion() {
		if (fashion==null) {
			fashion=new Fashion(driver);
		}
		return fashion;
	}
	

}
