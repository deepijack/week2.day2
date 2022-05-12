package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {

	public static void main(String[] args) {
		    WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
		    driver.get("http://leaftaps.com/opentaps/control/main");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Create Lead")).click();
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		    
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("deepika");
		    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jack");

		    
		    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("29/07/2001");
		    WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		    Select ele=new Select(source);
		    ele.selectByVisibleText("Employee");
		    
		    WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		    Select ele2=new Select(industry);
		    ele2.selectByIndex(2);
		    
		    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		    Select ele3=new Select(ownership);
		    ele3.selectByValue("OWN_CCORP");
		    
		    WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		    Select ele4=new Select(marketing);
		    ele4.selectByVisibleText("Automobile");
		    
		    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		    Select ele5=new Select(country);
		    ele5.selectByVisibleText("India");
		    
		   // WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		    //Select ele6=new Select(state);
		    ////ele6.selectByVisibleText("");
		    
		    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("637501");
		    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("011");
		    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepika29@gmail.com");
		    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99988877546");
		    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("deepika");
		    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("leaftaps.com");
		    
		    
		    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("koki");
		    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("testleaf");
		    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("palavanthangal");
		    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600100");
		    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("divya");
		    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("nanganallur");
		    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("225");
		    
		   
		    String firstname=driver.findElement(By.className("inputBox")).getText();
		    System.out.println(firstname);
		    driver.findElement(By.name("submitButton")).click();
		    //driver.close();
		    
		}

}
