package practiceseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
	List<WebElement> elements= driver.findElements(By.xpath("//div"));
	for(WebElement i:elements) {
		String str = i.getText();
		System.out.println(str);
	}
	
		
	}

}
