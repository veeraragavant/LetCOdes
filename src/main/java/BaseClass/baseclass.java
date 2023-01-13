package BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.bytecode.Duplication;

public class baseclass {

	public static WebDriver driver;
	
	public static void browserlaunch(String value) {
	
		if (value.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resoure\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (value.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "");
			driver = new EdgeDriver();
		}
		
}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void elementclick(WebElement element) {
		element.click();		
	}
	
	public static void screenmax() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public static void sendkeysss(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	
	public static boolean isdisplayed(WebElement element) {
		boolean display = false;
		try {
			display = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("Cant able to display element: "+e.getMessage());
		}
		return display;
	}
	
	public static void dropdowns(WebElement element, int value) {
		Select sel = new Select(element);
		sel.selectByIndex(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
