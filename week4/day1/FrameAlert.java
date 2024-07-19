package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class FrameAlert {

	public static void main(String[] args) {
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=Tryjs_confirm");
	 driver.manage().window().maximize();
	 driver.switchTo().frame("iframeResult");
	 driver.findElement(By.xpath("//button[text()='try it']")).click();
	 Alert alert =  driver.switchTo().alert();
	  System.out.println(alert.getText());
	 alert.dismiss();
	 
	 
			 
	 

	}

}
