package create_task;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import projspecific.ProjectSpecific;




public class Create_Task extends ProjectSpecific {

	
	@Test
	public void Login() throws InterruptedException {
		
		
		

	
		//Clicking n Plus button
		Thread.sleep(20000);
		
		WebElement plus = driver.findElementByXPath("//*[@class='slds-icon slds-icon_x-small']");
				
		
		Thread.sleep(15000);
		plus.click();
		
		System.out.println("Able to click SVG");
		
		//driver.findElementByxPath("//*")
		
		//driver.findElementByXPath("//*[@class=auraMsgBox auraLoadingBox']").click();
		driver.findElementByXPath("(//span[@class='actionLabel'])[2]").click();
		
		//Entering the subject name in boot camp
		
		WebElement sub= driver.findElementByXPath("(//*[@class='slds-combobox_container'])");
		
		sub.sendKeys("Bootcamp");
		
		System.out.println("Subject entered");
		
		//Selecting contact as Sarath M
		
		//WebElement cntact = driver.findElementByXPath("(//div[@class='slds-form slds-form_stacked slds-is-editing'])");
		
		//cntact.click();
		
		driver.findElementByXPath("(//input[@title='Search Contacts'])").click();
		 

		driver.findElementByXPath("(//input[@title='Search Contacts'])").sendKeys("Sarath M");
		
		Thread.sleep(3000);
		 
		driver.findElementByXPath("(//input[@title='Search Contacts'])").sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		 
		
		 								
		//Select the status Waiting n somene else
		
		driver.findElementByXPath("//span[text()='Status']/following::a[1]").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//span[text()='Status']/following::a[6]").click();
		
		//Clicking on save button:
		
		driver.findElementByXPath("(//*[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton'])").click();
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//slds-input slds-combobox__input
		
		
		
		
		
		
		
		//System.out.println("loggedin");
		
		
		
		
		
		
	}

}
