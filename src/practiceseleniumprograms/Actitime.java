package practiceseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();*/
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		driver.findElement(By.xpath("(//div)[13]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a)[8]")).click();
		
		
		
	}

}
