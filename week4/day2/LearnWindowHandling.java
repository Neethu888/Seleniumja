package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {



	public static void main(String[] args) {
	      ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      String windowHandle = driver.getWindowHandle();
	      System.out.println(windowHandle);
	      driver.findElement(By.id("twoabsearchtextbox")).sendKeys("mobilephones"+Keys.ENTER);
	      driver.findElement(By.xpath("//a[@target='_blank']")).click();
	      Set<String>windowHandle1 = driver.getWindowHandles();
		for(String string : windowHandle1) {
			System.out.println(string);
		}
	
	    	List<String>windows = new ArrayList<String>(windowHandle1) ;
	    	System.out.println("Before handling"+driver.getTitle());
	    	driver.switchTo().window(windows.get(1));
	    	System.out.println(driver.getTitle());
	    	driver.quit();
	    	driver.switchTo().newWindow(WindowType.WINDOW);
	    	System.out.println(driver.getTitle());
	    	driver.switchTo().window(windows.get(0));
	    	driver.findElement(By.xpath("(//a[@target='_blank'])[10]")).click();
	    	driver.switchTo().window(windows.get(2));
	    	System.out.println("------------------");
	    	Set<String> windowHandles2 = driver.getWindowHandles();
	    	for(String string:windowHandles2) {
	    		driver.switchTo().window(string);
	    		System.out.println(driver.getTitle());
	    		
	    	}
	    	
	    	
	    	
	    	
	    	  
	      }
	      
	      

	}


