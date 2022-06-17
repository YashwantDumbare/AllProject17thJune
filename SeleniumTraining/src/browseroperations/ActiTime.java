package browseroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		//.customerSelector.customerOrProjectSelector.selectorWithPlaceholderContainer>.components_combobox.cpCombobox>.scrollableDropdownView

	}

}
