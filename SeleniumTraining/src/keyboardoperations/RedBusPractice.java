package keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".autoFill.homeSearch>:nth-of-type(2)"));

	}

}
