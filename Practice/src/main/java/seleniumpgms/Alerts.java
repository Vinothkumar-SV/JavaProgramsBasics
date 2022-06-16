package seleniumpgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert();
		String text1 = alert.getText();
		System.out.println(text1);
		alert.dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println(text2);		
		alert.sendKeys("Vinoth kumar");
		alert.accept();
		driver.quit();
		
		
		
		
		
	}
	

}
