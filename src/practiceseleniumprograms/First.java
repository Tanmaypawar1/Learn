package practiceseleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
