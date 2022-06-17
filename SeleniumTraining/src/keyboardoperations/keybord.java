package keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class keybord {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://demo.actitime.com/login.do");
	WebElement Username=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr>td:nth-of-type(2)>:nth-of-type(1)"));
	String cred=Username.getText();
	WebElement Usernamefield=driver.findElement(By.cssSelector("[placeholder='Username']"));
	Usernamefield.sendKeys(cred,Keys.chord(Keys.CONTROL,"a"));
	Usernamefield.sendKeys(Keys.chord(Keys.CONTROL,"c"));
	Usernamefield.sendKeys(Keys.chord(Keys.TAB));
	driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("manager",Keys.TAB);
	driver.findElement(By.cssSelector("#loginButton")).click();
	
	//driver.close();
	

	}

}
