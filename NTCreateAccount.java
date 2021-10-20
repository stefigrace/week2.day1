package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

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
		
		WebElement eleCurrency = driver.findElement(By.id("currencyUomId"));
		Select dropDown = new Select(eleCurrency);
		dropDown.selectByValue("INR");
		
		driver.findElement(By.name("description")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Stefi");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("OMR");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("1.5M");
		
		WebElement eleIndustry = driver.findElement(By.name("industryEnumId"));
		Select dropDownIndustry = new Select (eleIndustry);
		dropDownIndustry.selectByValue("IND_SOFTWARE");
		
		
		WebElement eleOwnership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select dropDownOwnership = new Select (eleOwnership);
		dropDownOwnership.selectByVisibleText("S-Corporation");
		
		WebElement eleSource = driver.findElement(By.id("dataSourceId"));
		Select dropDownSource = new Select (eleSource);
		dropDownSource.selectByValue("LEAD_EXISTCUST");
		
		WebElement eleMarket = driver.findElement(By.id("marketingCampaignId"));
		Select dropDownMarket = new Select (eleMarket);
		dropDownMarket.selectByIndex(7);
		
		WebElement eleState = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropDownState = new Select (eleState);
		dropDownState.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		System.out.println(driver.findElement(By.xpath("//li[@class='errorMessage']")).getText());
		
		driver.close();		
	}

}
