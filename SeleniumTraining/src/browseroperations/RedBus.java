package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#src")).sendKeys("Pune");
		driver.findElement(By.cssSelector(".autoFill.homeSearch>:nth-of-type(4)")).click();
		driver.findElement(By.cssSelector("#dest")).sendKeys("Goa");
		driver.findElement(By.cssSelector(".autoFill.homeSearch>li:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector("#onward_cal")).click();
		driver.findElement(By.cssSelector(".next")).click();
		driver.findElement(By.cssSelector(".rb-calendar>.rb-monthTable.first.last>tbody>*:nth-child(4)>.wd.day:nth-of-type(3)")).click();
		driver.findElement(By.id("search_btn")).click();
		driver.findElement(By.cssSelector(".dept-time.dt-time-filter>li:nth-of-type(4)")).click();
		driver.findElement(By.cssSelector(".list-chkbox>li:nth-of-type(3)")).click();
	
		List<WebElement> buses=	driver.findElements(By.cssSelector(".clearfix.bus-item>.clearfix.bus-item-details>div>div>.travels.lh-24.f-bold.d-color"));
		System.out.println(buses.size());
		for(int i=0;i<buses.size();i++) {
			System.out.println(buses.get(i).getText());
		}
		
		
	
		driver.close();
	}

}
