package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Stefi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Z");
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(eleSource);
		dropDown.selectByVisibleText("Employee");
		
		WebElement eleMark = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown1 = new Select(eleMark);
		dropDown1.selectByValue("9001");
		
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2 = new Select(eleOwnership);
		dropDown2.selectByIndex(5);
		
		WebElement eleCountry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropDown3 = new Select(eleCountry);
		dropDown3.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String strTitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		
		System.out.println("Title: "+ strTitle);
		
		

	}

}
