package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='FLIGHTS']")).click();
		Set<String> windowsHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowsHandles);
		driver.switchTo().window(window.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(window.get(0));
		driver.close();
		
		
		
	}

}
