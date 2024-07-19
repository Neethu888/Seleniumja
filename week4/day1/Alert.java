package week4.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert{

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span(text()='Show'])[5]")).click();
		org.openqa.selenium.Alert promptAlert =  driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("neethu");
		promptAlert.dismiss();
		String retrivedText = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(retrivedText);
		
	}

}
