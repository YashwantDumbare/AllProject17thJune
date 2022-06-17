package keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
	
		
		 String expectedTitle="actiTIME - Login";
		 String actualTitle= driver.getTitle();
		 if (actualTitle.equals(expectedTitle)) {
		 	System.out.println("Login Page Opened Succedssfully");
		 }else {
			 System.out.println("Either login page not opened or Page title got change");
		 }
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(10000);
		 
		 //driver.findElement(By.name("logoutButton")).click();
		
		 String actualtitle=driver.getTitle();
		 String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		
		if (actualtitle.equals(expectedHomePageTitle)) {
		  System.out.println("Succesfully Login");
		 }else{
			 System.out.println("Succesfully not login Or Title got changed");
		 }
		 
		 driver.findElement(By.id("logoutLink")).click();

	}

}
