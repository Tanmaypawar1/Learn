package practiceseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[8]")).click();
	}

}
