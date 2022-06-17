package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsApp {

	public static void main(String[] args) {
		String path1=System.getProperty(".\\executables\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("input"));
	element.click();
	element.sendKeys("whatsapp");
	
	}

}
