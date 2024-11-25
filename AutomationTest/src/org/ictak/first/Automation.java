package org.ictak.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/");
     driver.manage().window().maximize();
    Thread.sleep(5000);
    // driver.findElement(By.id("twotabsearchtextbox"))
    //.sendKeys("iphone 15");
    driver.findElement(By.name("field-keywords"))
  .sendKeys("iphone 15");
    driver.findElement(By.id("nav-search-submit-button"))
     .click();
    // driver.findElement(By.xpath("//input[@name='field-keywords']"))
     //.sendKeys("mobile");
     //driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).click();
    // driver.findElement(By.cssSelector("a[title='Amazon miniTV']")).click();

  //  driver.findElement(By.xpath("//a[contains(text(),'Kitchen')]")).click();
    //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("ammu");//id
    // driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("ammu");//class
  // driver.findElememt(By.linkText("Amazon miniTV").click;
   
    
     
     
     }

}
