package growpitalPackage;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrowpitalClass 
{

	public static void main(String[] args)
	{
		//Set Up WebDriver
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Navigate to login page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://app.growpital.com/login");
		
		//fill in login credentials
		WebElement emailinput = driver.findElement(By.xpath("//input[@class='email-input']"));
		emailinput.clear();
		emailinput.sendKeys("pratik.giri0987@gmail.com");
		
		WebElement passwordinput = driver.findElement(By.xpath("//input[@placeholder='********']"));
		passwordinput.clear();
		passwordinput.sendKeys("Pratik@7695");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='custom-button ']//div[contains(text(),'Login')]"));
		loginbutton.click();
		
		//Navigate to profile page
	    driver.manage().window().fullscreen(); 
		WebElement profile = driver.findElement(By.xpath("//div[@class='user-info']//*[name()='svg']"));		
		profile.click();
		
		//Navigate to view profile tab
		WebElement viewprofiletab = driver.findElement(By.xpath("//span[normalize-space()='View Profile']"));
		viewprofiletab.click();
		
		//fill in personal information
		
		WebElement UserType = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]"));
		UserType.click();
		Select s =new Select(UserType);
		s.selectByValue("1");
		WebElement SubmitButton = driver.findElement(By.xpath("//div[contains(text(),'Submit')]"));
		SubmitButton.click();
		
		WebElement FullnameInput = driver.findElement(By.xpath("//div[contains(text(),'Full Name')]"));
		FullnameInput.clear();
		FullnameInput.sendKeys("Pratik Giri");
		
		WebElement PANInput = driver.findElement(By.xpath("//div[3]//div[2]//div[1]//div[2]"));
		PANInput.clear();
		PANInput.sendKeys("BRGPG7564");
		WebElement Submitbutton = driver.findElement(By.xpath("//div[contains(text(),'Submit')]"));
		Submitbutton.click();
		
		WebElement AadharCard = driver.findElement(By.xpath("//div[4]//div[2]//div[1]//div[2]"));
		AadharCard.clear();
		AadharCard.sendKeys("153740589452");
		WebElement getOTP = driver.findElement(By.xpath("//div[contains(text(),'Get OTP')]"));
		getOTP.click();
		WebElement OTP = driver.findElement(By.xpath("//input[@placeholder='Enter OTP received on your registered mobile.']"));
		OTP.clear();
		OTP.sendKeys("7592");
		WebElement submitbutton = driver.findElement(By.xpath("//div[contains(text(),'Submit OTP')]"));
		submitbutton.click();
		
		WebElement Email = driver.findElement(By.xpath("//div[contains(text(),'Email')]"));
		Email.clear();
		Email.sendKeys("pratik.giri0987@gmail.com");
		
		WebElement phonenumber = driver.findElement(By.xpath("//div[contains(text(),'Phone Number')]"));
		phonenumber.clear();
		phonenumber.sendKeys("9404823277");
		
		WebElement dateofbirth = driver.findElement(By.xpath("//div[contains(text(),'Date of Birth')]"));
		dateofbirth.clear();
		dateofbirth.sendKeys("07 June 19950");
		
		WebElement address = driver.findElement(By.xpath("//div[contains(text(),'Address')]"));
		address.clear();
		address.sendKeys("Noida,UttarPradesh India");
		
		//Upload documents
		WebElement pancard = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		pancard.sendKeys("C:\\Users\\HP\\Downloads\\ppan001.jpg");
		WebElement UploadButton = driver.findElement(By.xpath("//div[@class='content-section upload-section']//div[2]//div[2]//button[1]//div[1]"));
		UploadButton.click();
		
		WebElement aadhar = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/input[1]"));
		aadhar.sendKeys("C:\\Users\\HP\\Downloads\\paadhar.jpg");
		WebElement uploadButton = driver.findElement(By.xpath("//div[@class='content-section upload-section']//div[2]//div[2]//button[1]//div[1]"));
		uploadButton.click();
		
		WebElement bankstatement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/input[1]"));
		bankstatement.sendKeys("C:\\Users\\HP\\Downloads\\pbankstatement.jpg");
		WebElement uploadbutton = driver.findElement(By.xpath("//div[@class='content-section upload-section']//div[2]//div[2]//button[1]//div[1]"));
		uploadbutton.click();	
		
		//Close the browser
		driver.quit();
		

}

}
