package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OmayoBlogspot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		WebElement drp1=driver.findElement(By.id("drop1"));
		Select selectdrp1=new Select(drp1);
		System.out.println(selectdrp1.isMultiple());
		List<WebElement> selectOptions=selectdrp1.getOptions();
	
		//driver.close();
	}

}
