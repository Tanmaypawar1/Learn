package practiceseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a)[3]")).click();
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s =new Select(Day);
		//s.selectByVisibleText("22");
		//s.selectByValue("22");
		s.selectByIndex(21);
	}

}
