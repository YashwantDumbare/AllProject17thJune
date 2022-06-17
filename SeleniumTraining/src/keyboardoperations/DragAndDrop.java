package keyboardoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()=\"Sortable\"]")).click();
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		Actions act= new Actions(driver);
		
		List<WebElement> src=driver.findElements(By.cssSelector("ul>.ui-state-default.ui-sortable-handle"));
		List<WebElement> target=driver.findElements(By.cssSelector("ul>.ui-state-default.ui-sortable-handle"));

		//WebDriverWait wait=new WebDriverWait(driver,20);
		act.dragAndDrop(src.get(5), target.get(1)).build().perform();
		//driver.close();
	}

}
