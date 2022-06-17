package keyboardoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropJQuery {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		List<WebElement> source = driver.findElements(By.cssSelector("body>ul>li"));
		
		List<WebElement> target = driver.findElements(By.cssSelector("body>ul>li"));
		
		//System.out.println(sortable.size());
		
		for(int i =source.size()-1; i>0;i--) {
			act.dragAndDrop(source.get(i), target.get(0)).build().perform();
		}

	}

}
