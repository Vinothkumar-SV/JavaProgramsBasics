package seleniumpgms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=2531222974944376429&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301601&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=Cj0KCQjwnNyUBhCZARIsAI9AYlHZe6hE9QhGhhCHHIEpuZxXv4WVjlRRh8aYhJlVxV9v5OA1oXm_q40aAoASEALw_wcB");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).click();
driver.findElement(By.xpath("//a[text()='Amazon Launchpad']")).click();
driver.findElement(By.xpath("//a[@href='/b/?_encoding=UTF8&ie=UTF8&node=10894230031&ref_=sv_lpdin_2']")).click();
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Honey",Keys.ENTER);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
driver.findElement(By.xpath("//span[text()='₹10,000 - ₹20,000']")).click();
driver.findElement(By.xpath("//span[text()='60% Off or more']")).click();
driver.findElement(By.xpath("//div[@id='nav-subnav']/a[2]")).click();
driver.findElement(By.xpath("//span[text()='Accessories & Peripherals']")).click();
driver.findElement(By.xpath("//span[text()='FireWire Hubs']")).click();
driver.close();
driver.quit();
	
}
}
