package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();		
		driver.findElement(By.linkText("Find Accounts")).click();
		
		driver.findElement(By.name("accountName")).click();
		driver.findElement(By.name("accountName")).clear();
		driver.findElement(By.name("accountName")).sendKeys("Credit Limited Account");
		
		//driver.findElement(By.name("accountName")).sendKeys("Credit Limited Account");
		//driver.findElement(By.xpath("//input[@name='accountName']")).sendKeys("Credit Limited Account");
		
		//driver.findElement(By.xpath("//input[@name='id']")).sendKeys("accountlimit100");
		driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
		
		driver.findElement(By.linkText("Credit Limited Account")).click();
		driver.findElement(By.linkText("Edit")).click();
		String strAccName = driver.findElement(By.id("accountName")).getAttribute("value");
		System.out.println("Account Name: " + strAccName);
		
		if (strAccName.equals("Credit Limited Account")) {
			System.out.println("Account Name is correct");
		}
		else {
			System.out.println("Account Name is incorrect");					
			
		}
		driver.close();
	}

}
