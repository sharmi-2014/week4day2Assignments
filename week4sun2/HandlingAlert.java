package week4sun2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {


public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.leafground.com/alert.xhtml");
	   driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
	//click to simple alert
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
	
	//click to confirm alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
	Alert alert2 = driver.switchTo().alert();
	String text2 = alert.getText();
	System.out.println(text2);
	alert.accept();
	
	//click to sweet  alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	
	//click to sweet modal
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
	driver.findElement(By.xpath("(//div[@class='card'])[1]")).click();
	
	//click to prompt alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
	Alert alert4 = driver.switchTo().alert();
	String text4 = alert.getText();
	System.out.println(text4);
	alert.accept();
	
	//click to confirmation sweet alert
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
	driver.findElement(By.xpath("//span[text()='Yes']")).click();
	
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
	
    driver.close();
	
	
}

}
