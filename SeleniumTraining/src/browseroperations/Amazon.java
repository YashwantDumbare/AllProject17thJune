package browseroperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_bestsellers']")).click();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}

}
