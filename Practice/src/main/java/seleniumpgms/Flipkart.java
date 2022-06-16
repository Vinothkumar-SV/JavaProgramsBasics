package seleniumpgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MICROSECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='Appliances']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"))).build().perform();
		a.click(driver.findElement(By.xpath("//a[text()='50-55 Inch']"))).build().perform();
		driver.navigate().to("https://www.flipkart.com/xiaomi-oled-vision-138-8-cm-55-inches-4k-ultra-hd-smart-android-tv-dolby-iq-atmos-2022-model/p/itmed40ebe7b170d?pid=TVSGDJGMHWY9VMFR&lid=LSTTVSGDJGMHWY9VMFRMFWNSK&marketplace=FLIPKART&store=ckf%2Fczl&srno=b_1_1&otracker=hp_rich_navigation_6_2.navigationCard.RICH_NAVIGATION_Appliances~Televisions~50-55%2BInch_G16XZAMNRE0A&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L2_view-all&fm=organic&iid=en_6ZhJDfGFl8TdfO%2B4teyKHndoZ3ikrOeOU5JCZGZWyIHLo%2FF0c71RrO3iP06VH0wU9rXwlD7qRDfIgBryRk9pdQ%3D%3D&ppt=hp&ppn=homepage&ssid=viwsu7gx0g0000001654179247453");
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("621306");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='View Details']"))).build().perform();
		
		a.click(driver.findElement(By.xpath("//span[text()='View Details']"))).build().perform();
		driver.findElement(By.xpath("//button[text()='✕'and@class='_2KpZ6l _1KAjNd']")).click();
		
		driver.quit();

	}
}
