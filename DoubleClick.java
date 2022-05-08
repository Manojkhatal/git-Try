package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);

		

		Actions act = new Actions(driver);
        
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		
	}

}
