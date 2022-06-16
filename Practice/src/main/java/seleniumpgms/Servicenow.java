package seleniumpgms;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Servicenow {
static	WebDriver Wait;
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.servicenow.com/");
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	
	Actions mouse = new Actions(driver);
	mouse.moveToElement(driver.findElement(By.xpath("//li[@rel='solutionsNav']"))).build().perform();
	WebDriverWait wait2=new WebDriverWait(driver, 30);
	WebElement elem2 =wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Industry Solutions']")));
	mouse.moveToElement(elem2).build().perform();
	
	mouse.moveToElement(driver.findElement(By.xpath("//a[text()='Industry Solutions']"))).build().perform();
//	mouse.clickAndHold(driver.findElement(By.xpath("//li[@class='active']//a[@href='/solutions/industry/manufacturing.html']"))).build().perform();
	
	  
	mouse.moveToElement(driver.findElement(By.xpath("//a[text()='Manufacturing']"))).build().perform();
	mouse.click(driver.findElement(By.xpath("//a[text()='Manufacturing']"))).build().perform();
	/*
	 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
	 * TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
	 * .ignoring(NoSuchElementException.class); WebElement clickseleniumlink =
	 * wait.until(new Function<WebDriver, WebElement>(){
	 * 
	 * public WebElement apply(WebDriver driver ) { return
	 * driver.findElement(By.xpath(
	 * "//a[@href='/lpayr/idc-analyst-connection-new-business-models.html']")); }});
	 */
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement elem =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/my-account/sign-up.html']")));
	mouse.click(elem).build().perform();
	
	WebDriverWait wit = new WebDriverWait(driver, 40);
	WebElement ment = wit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Register']")));
	mouse.click(ment).build().perform();
	
	//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Vinoth");
	//driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Kumar");
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vinothkumarsv9@gmail.com");
	//driver.findElement(By.xpath("//input[@name='company']")).sendKeys("VKSolutions");
	//driver.findElement(By.xpath("//span[text()='Phone']")).sendKeys("6385701008");
	driver.close();
	
}
	
	
}
