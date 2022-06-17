package browseroperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	driver.get("https://www.gsmarena.com/");
	List<WebElement> PhoneList=driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
	System.out.println(PhoneList.size());
	for(int i=0;i<PhoneList.size();i++) {
	WebElement phones=PhoneList.get(i);
		String phonebrand= phones.getText();
		System.out.println("Phone Brand "+phonebrand);
	}
	List<WebElement> pages=driver.findElements(By.cssSelector(".review-nav.pullNeg.col.pushT10 .nav-pages>a"));
	//pages.size();
	//driver.close();
	
	}
	
}
