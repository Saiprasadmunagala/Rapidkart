package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
public static void main(String[]args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 driver.findElement(By.id("search-input")).sendKeys("HappyBirthday");
	 driver.findElement(By.id("search-icon-legacy")).click();
	 driver.findElement(By.xpath("//img[@src=\"https://i.ytimg.com/vi/_z-1fTlSDF0/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBF_7ZJAXzp5qTfnhF8bkkVCKhh0w\"]")).click();
	System.out.println("Hi This changes was made in the Github");
	}

}
