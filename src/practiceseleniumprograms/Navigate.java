package practiceseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().back();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
	    Dimension d = new Dimension(100, 200);
	    driver.manage().window().setSize(d);
	    Point p =new Point(300, 400);
	    driver.manage().window().setPosition(p);
	    driver.manage().window().maximize();
	 String PS= driver.getPageSource();
	 System.out.println(PS);
	  String title = driver.getTitle();
	  System.out.println(title);
	}

}
