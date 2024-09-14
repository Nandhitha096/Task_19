package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		//Setting up the chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	
		//Launching the provided url
		driver.get("https://www.guvi.in/register");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		//Locating with ID 
		
		WebElement elementById1 = driver.findElement(By.id("signup"));
		WebElement elementById2 = driver.findElement(By.id("email"));
		WebElement elementById3 = driver.findElement(By.id("google-button"));
		WebElement elementById4 = driver.findElement(By.id("firstName"));
		WebElement elementById5 = driver.findElement(By.id("lastName"));
		WebElement elementById6 = driver.findElement(By.id("emailInput"));
		WebElement elementById7 = driver.findElement(By.id("passwordInput"));
		WebElement elementById8 = driver.findElement(By.id("mobileNumberInput"));
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		//Locating with the TagName
		WebElement elementByTagName1 = driver.findElement(By.tagName("input"));
		WebElement elementByTagName2 = driver.findElement(By.tagName("main"));
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
						
		//Locating with the ClassName
		WebElement elementByClassName1 = driver.findElement(By.className("btn-outline-google"));
		WebElement elementByClassName2 = driver.findElement(By.className("btn-primary"));
		WebElement elementByClassName3 = driver.findElement(By.className("form-control"));  
		WebElement elementByClassName4 = driver.findElement(By.className("alternative-login-message"));
					
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

		//Locating with CSS Selector
		 
		WebElement elementByCssSelector1 = driver.findElement(By.cssSelector("#firstName"));		
		WebElement elementByCssSelector2 = driver.findElement(By.cssSelector("a.btn.btn-outline-google"));
		WebElement elementByCssSelector3 = driver.findElement(By.cssSelector("button[type*='button']"));
		WebElement elementByCssSelector4 = driver.findElement(By.cssSelector(".form-control[placeholder*='Password']"));
		WebElement elementByCssSelector5 = driver.findElement(By.cssSelector("input[type='email']"));
		WebElement elementByCssSelector6 = driver.findElement(By.cssSelector("input[placeholder$='red']"));
		WebElement elementByCssSelector7 = driver.findElement(By.cssSelector("input[placeholder*='red']"));
		WebElement elementByCssSelector8 = driver.findElement(By.cssSelector("input[placeholder^='E-']"));
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
								
		//Locating with the XPath
		WebElement elementByXPath1 = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement elementByXPath2 = driver.findElement(By.xpath("//input[contains(@id,'firstName')]"));
		WebElement elementByXPath3 = driver.findElement(By.xpath("//a[@id='google-button']"));
		WebElement elementByXPath4 = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement elementByXPath5 = driver.findElement(By.xpath("//*[contains(@placeholder,'Mobile number')]"));
		WebElement elementByXPath6 = driver.findElement(By.xpath("//input[starts-with(@id,'mobile')]"));
		WebElement elementByXPath7 = driver.findElement(By.xpath("//*[contains(text(),'Please Enter a valid First Name')]"));
		WebElement elementByXPath8 = driver.findElement(By.xpath("//div/input[@id='lastName']"));
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		 
		 // Close the WebDriver
         driver.quit();
			

	}

}
