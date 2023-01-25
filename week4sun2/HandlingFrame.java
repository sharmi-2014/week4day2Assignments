package week4sun2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {
	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.leafground.com/frame.xhtml");
		   driver.switchTo().frame(0);
		   driver.findElement(By.id("Click")).click();
		    //driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		    String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		    System.out.println(text);
		    driver.switchTo().defaultContent();
		   // driver.switchTo().frame(2);
		     List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		     int size=totalframes.size();
		     System.out.println(size);
		    
		    //driver.switchTo().defaultContent();
		    driver.switchTo().frame(2);
		    driver.switchTo().frame("frame2");
		   driver.findElement(By.id("Click")).click();
		     String text2 = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		
		    System.out.println(text2);
		 
		   }
	
}