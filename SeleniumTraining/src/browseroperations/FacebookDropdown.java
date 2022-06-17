package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("[id^='u_0_2_']")).click();
		WebElement daydrp =driver.findElement(By.cssSelector("#day"));
		System.out.println("Is day dropdown enabled: "+daydrp.isEnabled());
		System.out.println("Is day dropdown visible: "+daydrp.isDisplayed());
		daydrp.click();
		Select daydrp1=new Select(daydrp);
		List<WebElement> alldays= daydrp1.getOptions();
		System.out.println("total no of days options are: "+alldays.size());
		System.out.println("Is day dropdown multiselect: "+daydrp1.isMultiple());
		System.out.println("Default value of day dropdown is: "+daydrp1.getFirstSelectedOption().getText());
		daydrp1.selectByIndex(19);
		System.out.println("*****************************************");
		driver.findElement(By.id("month"));
		WebElement monthdrp=driver.findElement(By.id("month"));
		System.out.println("Is month dropdown enabled: "+monthdrp.isEnabled());
		System.out.println("Is month dropdown visible: "+monthdrp.isDisplayed());
		monthdrp.click();
		Select monthdrp1=new Select(monthdrp);
		List<WebElement> allmonths= monthdrp1.getOptions();
		System.out.println("total no of months options are: "+allmonths.size());
		System.out.println("Is month dropdown multiselect: "+monthdrp1.isMultiple());
		System.out.println("Default value of month dropdown is: "+monthdrp1.getFirstSelectedOption().getText());
		monthdrp1.selectByIndex(11);
		monthdrp.click();
		System.out.println("*****************************************");
		WebElement yeardrp =driver.findElement(By.id("year"));
		System.out.println("Is year dropdown enabled "+yeardrp.isEnabled());
		System.out.println("Is year dropdown visible "+yeardrp.isDisplayed());
		Select yeardrp1=new Select(yeardrp);
		List<WebElement> allyears=yeardrp1.getOptions();
		System.out.println("Total no of years :"+allyears.size());
		System.out.println("Is year dropdown multiselect :"+yeardrp1.isMultiple());
		System.out.println("Default value of year dropdown is :"+yeardrp1.getFirstSelectedOption().getText());
		
		
		Thread.sleep(10000);
		driver.close();
	}


}
