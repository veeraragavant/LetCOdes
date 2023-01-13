package Locators;

import java.util.List;

import javax.swing.text.html.parser.TagElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseClass.baseclass;

public class Fashion extends baseclass{

	public Fashion(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='ProductModule__dummyDiv']")
	private List<WebElement> total;

	public WebElement getSingleprice() {
		return singleprice;
	}

	public List<WebElement> getTotal() {
		return total;
	}
	
	@FindBy(xpath = "((//div[@class='ProductModule__dummyDiv'])[1]//parent::a")
	private WebElement singleprice;
	
	@FindBy(id = "wzrk-cancel")
	public WebElement cancelling;
	
	@FindBy(xpath = "//a[@class='wzrkClose']")
	public WebElement clsg;
	
	@FindBy(id = "home")
	public WebElement firsttab;
	
	@FindBy(id = "singleframe")
	public WebElement frames;
	
	@FindBy(css = "input[type='text']")
	public WebElement entertxt;
	
	@FindBy(xpath = "(//a[@class='analystic'])[2]")
	public WebElement multipleframes;
	
	@FindBy(xpath = "//iframe[@src=\"MultipleFrames.html\"]")
	public WebElement multipleframes1;
	
	@FindBy(xpath = "(//iframe[@src='SingleFrame.html'])[1]")
	public WebElement multipleframes2;
	
	@FindBy(css = "input[type='text']")
	public WebElement multipleframes3;
	
	@FindBy(xpath = "//img[@alt='image not displaying']")
	public WebElement imageverify;
	
	@FindBy(id = "advancedtable")
	private WebElement tablename;
	
	@FindBy(xpath = "//th[@aria-controls='advancedtable']")
	private List<WebElement> headers;

	public WebElement getTablename() {
		return tablename;
	}

	public void setTablename(WebElement tablename) {
		this.tablename = tablename;
	}

	public List<WebElement> getHeaders() {
		return headers;
	}

	public void setHeaders(List<WebElement> headers) {
		this.headers = headers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
