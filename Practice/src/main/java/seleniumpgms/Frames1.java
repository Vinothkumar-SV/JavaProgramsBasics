package seleniumpgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.testleaf.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='webWidget']"));
		driver.switchTo().frame(frame);
		WebElement textvalue =driver.findElement(By.xpath("//h1[text()='Always Ahead']"));
		
		if(textvalue.isDisplayed()) {
			System.out.println("The Text is Displayed"+textvalue.getText());
		}
		driver.findElement(By.xpath("//button[@class='sc-htpNat FooterIconButton-sc-kyno95-0 fJoBhq sc-EHOje hssBvG']")).click();
		driver.findElement(By.xpath("//button[text()='End']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@data-testid='message-field']")).sendKeys("End chat");
		driver.findElement(By.xpath("//button[text()='Send']")).click();
		Actions mouse= new Actions(driver);
		mouse.click(driver.findElement(By.xpath(" //li[@class='nav-item']//a[text()='Courses'and@href='all-courses.html']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Testing']")).click();
		driver.findElement(By.xpath("//img[@src='https://assets.testleaf.com/assets/img/wd.svg']")).click();
		WebElement details = driver.findElement(By.xpath("//div[@id='quick-info']//div[@class='banner-card-item position-relative overflow-hidden']"));
		System.out.println(details.getText());
		driver.close();
		
	}}