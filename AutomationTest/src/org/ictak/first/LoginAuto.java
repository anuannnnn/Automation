package org.ictak.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class LoginAuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     //driver.manage().window().maximize();
	     Thread.sleep(5000);
	    // driver.findElement(By.xpath("//input[@name='username']"))
	    // .sendKeys("Admin");
	    // driver.findElement(By.xpath("//input[@name='password']"))
	     //.sendKeys("admin123");
	    // driver.findElement(By.className("orangehrm-login-button")).click();
	     // driver.findElement(By.xpath("//input[@placeholder='Password']"));
	    // driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("amu");
	    // driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//child::p")).click();
    // driver.findElement(By.xpath("//p[@text='Forgot your password?']//parent::div")).click();
	     //css selector
	    // driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ammu");
	     String textname= driver.findElement(By.xpath("//h5[text()='Login']")).getText();
	     if(textname.equals("Login"))
	     {
	    	 System.out.println("Test case passed");
	     }
	     else
	     {
	    	 System.out.println("test case failed");
	     }
boolean text=driver.findElement(By.name("password")).isDisplayed();
if(text==true)
{
	System.out.println("test case passed");
}
else
{
	System.out.println("test case failed");
}

	}

}
