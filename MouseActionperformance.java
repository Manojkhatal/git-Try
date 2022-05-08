package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionperformance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(3000);

driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.xpath("//div[text()='More']"))).perform();
act.moveToElement(driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"))).click().build().perform();
driver.findElement(By.xpath("//div[text()='24x7 Customer Care']")).click();







	}

}
