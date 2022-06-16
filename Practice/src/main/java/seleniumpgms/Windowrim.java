package seleniumpgms;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowrim {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//h5[text()='Window']")).click();
	driver.findElement(By.xpath("//button[@id='home']")).click();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		
		driver.getWindowHandle();
	driver.getWindowHandles();
	@SuppressWarnings("unused")
	WebDriverWait wait = new WebDriverWait(driver, 3000);
		//driver.switchTo().defaultContent();		
 Set<String> all = driver.getWindowHandles(); 
 Iterator<String> iterate= all.iterator();
 while(iterate.hasNext()) 
 { String chd= iterate.next();
 if(all.equals(chd)) { driver.switchTo().window(chd); 
	WebElement text =driver.findElement(By.xpath("//h1[@class='wp-heading']"));
		 System.out.println(text.getText()); 

		 driver.close();
	}
}}}