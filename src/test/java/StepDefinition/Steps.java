package StepDefinition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.baseclass;
import POM.Pom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends baseclass{

	Pom ref = new Pom(driver);
	
	@Given("^User is Launching the Browser$")
	public void user_is_Launching_the_Browser() throws Throwable {
	    browserlaunch("CHRomE");
	}

	@Given("^User is Opening the URL$")
	public void user_is_Opening_the_URL() throws Throwable {
	    geturl("https://www.myntra.com/shop/men");
	    screenmax();
	}

	
	@When("^User is Logging through emailid \"([^\"]*)\"$")
	public void user_is_Logging_through_emailid(String arg1) throws Throwable {
		sendkeysss(ref.getFirstpg().usernme, arg1);
	    elementclick(ref.getFirstpg().btn);
	    Thread.sleep(5000);
	}

	@Then("^User is Logginng through password \"([^\"]*)\"$")
	public void user_is_Logginng_through_password(String arg1) throws Throwable {
		sendkeysss(ref.getFirstpg().pswrd, arg1);
		elementclick(ref.getFirstpg().pswdbtn);
		
	}
	
	@Then("^User is Selecting dropdownone (\\d+)$")
	public void user_is_Selecting_dropdownone(int arg1) throws Throwable {
	    dropdowns(ref.getFirstpg().fruits, arg1);
	}

	@Then("^User is Selecting dropdowntwo (\\d+)$")
	public void user_is_Selecting_dropdowntwo(int arg1) throws Throwable {
	    dropdowns(ref.getFirstpg().heroes, arg1);
	}

	@Given("^User is Calculating total Products in Page one$")
	public void user_is_Calculating_total_Products_in_Page_one() throws Throwable {
		ref.getFashion().cancelling.click();
		//ref.getFashion().clsg.click();
		Thread.sleep(5000);
	    List<WebElement> total = ref.getFashion().getTotal();
	    int sizes = total.size();
	    System.out.println(sizes);
	    //Assert.assertEquals("Matching Result Vs Expected", 40, size);
//	    WebElement singleprice = ref.getFashion().getSingleprice();
//	    String text = singleprice.getText();
//	    System.out.println(text);
	}
	
	@Then("^User is Opening Another Window and Performing Actions there$")
	public void user_is_Opening_Another_Window_and_Performing_Actions_there() throws Throwable {
	    ref.getFashion().firsttab.click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    //[CDwindow-A7E51C15BD68021C777AFEFE1A17B70E, CDwindow-84BB2645788FD149FF4A476790762ECF]
	    List<String> list = new LinkedList<String>(windowHandles);
	    driver.switchTo().window(list.get(1));
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
	    driver.switchTo().window(list.get(0));
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	}
	
	@Then("^User is Selecting the Frame$")
	public void user_is_Selecting_the_Frame() throws Throwable {
	    driver.switchTo().frame(ref.getFashion().frames);
	    sendkeysss(ref.getFashion().entertxt, "Hello");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		elementclick(ref.getFashion().multipleframes);
		driver.switchTo().frame(ref.getFashion().multipleframes1);
		driver.switchTo().frame(ref.getFashion().multipleframes2);
		sendkeysss(ref.getFashion().multipleframes3, "CSK");
		driver.switchTo().defaultContent();
		boolean isdisplayed = isdisplayed(ref.getFashion().imageverify);
	    Assert.assertEquals(true, isdisplayed);
		
	}
	

@Then("^User is Fetching Data in WebTables$")
public void user_is_Fetching_Data_in_WebTables() throws Throwable {
    
	WebElement tablename = ref.getFashion().getTablename();
	List<WebElement> findElements = tablename.findElements(By.xpath("//th[@aria-controls='advancedtable']"));
	for (WebElement headers : findElements) {
		String text = headers.getText();
		System.out.print(text);		
	}	
//	List<String> lists= new LinkedList<String>();
//	List<WebElement> findElements2 = tablename.findElements(By.xpath("//table[@id='advancedtable']//td"));
//	for (WebElement webElement : findElements2) {
//		String textss = webElement.getText();
//		lists.add(textss);
//	}
//	System.out.println(lists);
//	}
		
		WebElement findElement = tablename.findElement(By.xpath("//table[@id='advancedtable']//tr[4]//td[4]"));
		String string = findElement.getText();
		
		System.out.println(string);
	
}
@Then("^User is Performing Google Dynamics$")
public void user_is_Performing_Google_Dynamics() throws Throwable {
//    WebElement findElement = driver.findElement(By.xpath("//input[@class='gLFyf']"));
//    findElement.sendKeys("testingtolls");
//    Thread.sleep(4000);
//    
//    List<WebElement> findElements = driver.findElements(By.xpath("//ul[@role='listbox']//descendant::li"));
//    int size = findElements.size();
//    
//    for (int i = 0; i <size; i++) {
//    	WebElement webElement = findElements.get(i);
//    	String text = webElement.getText();
//    	System.out.println(text);
//	}
	
//	WebElement findElement = driver.findElement(By.xpath("//input[@role='combobox']"));
//	findElement.sendKeys("pursuitofhappiness\n");
//	Thread.sleep(5000);
//	List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']//descendant::li"));
//	int size = findElements.size();
//	for(int i=0; i<size;i++) {
//		WebElement webElement = findElements.get(i);
//		String text = webElement.getText();
//		System.out.println(text);
//	}
	//driver.findElement(By.linkText("Anytime")).click();
	
	
	


//    (//a[@data-reactid='54'])[2]  --- Contact Us

     
      JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement findElement = driver.findElement(By.xpath("(//a[@data-reactid='54'])[2]"));
      js.executeScript("arguments[0].click();", findElement);
      
      WebElement findElement2 = driver.findElement(By.xpath("//div[text()='HELP CENTER']"));
      String text = findElement2.getText();
      Assert.assertEquals(text, "HELP CENTER");
      Thread.sleep(10000);
      driver.quit();

}
}




	





