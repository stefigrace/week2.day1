package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Stefi.Z");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("OMR");
		driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("1.5m");
		
		WebElement eleIndustry = driver.findElement(By.name("industryEnumId"));
		Select dropDown = new Select (eleIndustry);
		dropDown.selectByValue("IND_SOFTWARE");
		
		
		WebElement eleOwnership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dropDown1 = new Select (eleOwnership);
		dropDown1.selectByVisibleText("S-Corporation");
		
		WebElement eleSource = driver.findElement(By.id("dataSourceId"));
		Select dropDown2 = new Select (eleSource);
		dropDown2.selectByValue("LEAD_EXISTCUST");
		
		WebElement eleMarket = driver.findElement(By.id("marketingCampaignId"));
		Select dropDown3 = new Select (eleMarket);
		dropDown3.selectByIndex(7);
		
		WebElement eleState = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropDown4 = new Select (eleState);
		dropDown4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();	
		
		//driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();

	}

}
