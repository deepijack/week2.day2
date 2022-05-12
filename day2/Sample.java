package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://WWW.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("deepika29072001@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Lion292001");
	driver.findElement(By.name("login")).click();
	}

}