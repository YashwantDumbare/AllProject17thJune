package keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keybordactitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernamefield =driver.switchTo().activeElement();
		usernamefield.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		usernamefield.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		usernamefield.sendKeys(Keys.TAB);
		WebElement passwordfield =driver.switchTo().activeElement();
		passwordfield.sendKeys("manager");
		passwordfield.sendKeys(Keys.TAB);
		WebElement chkbox =driver.switchTo().activeElement();
		chkbox.sendKeys(Keys.TAB);
		driver.switchTo().activeElement().click();
		
		

	}
	}
