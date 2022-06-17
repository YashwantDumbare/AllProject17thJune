package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");
		List<WebElement> categories=driver.findElements(By.cssSelector(".list-group>a#itemc"));
		System.out.println(categories.size());
		for (int i=0;i<categories.size();i++) {
			WebElement catelement=categories.get(i);
			String categoryname= catelement.getText();
			if(categoryname.equals("Laptops")) {
				catelement.click();
				break;
			}
		}
	}

}
