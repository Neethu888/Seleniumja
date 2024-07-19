package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLeadId {
	public static void main(String[]agrs) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.sendKeys("Demosalesmanager");
		driver.findElement(By.className("inputLogin")).sendKeys("crmsfa");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("leads")).click();
		int size = driver.findElements(By.xpath("//span[text()='Lead List']/following::div[@class='x-grid3-viewport']//table")).size();
		for (int i = 2; i <=size; i++) {
			String leadId = driver.findElement(By.xpath("(//span[text()='Lead List']/following::div[@class='x-grid3-viewport']//table)["+i+"]/tbody/tr[1]/td[1]")).getText();
			System.out.println(leadId);
		}
		driver.close();
	
	}
}

