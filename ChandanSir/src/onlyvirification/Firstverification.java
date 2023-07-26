package onlyvirification;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Firstverification {

	public static void main(String[] args) {
		//varifyloginpageElement();	
		varifyvalidlogin();
	}
	public static void varifyloginpageElement()
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\PracticeSelenium\\ChandanSir\\driver\\chromedriver.exe");
		ChromeDriver driver=   new ChromeDriver();
		driver.get("http://localhost:8888");
		String actualTitleofLoginpage=driver.getTitle();
		String expectedtitleofloginpage="vtiger CRM 5 - Commercial Open Source CRM";
		if(actualTitleofLoginpage.equals(expectedtitleofloginpage))
		{
			System.out.println("Passed.Title is correct on Login page");	
		}else
		{
			System.out.println("Failed .Title is not correct on login page");
		}
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		boolean  actualusernamevisible= username.isDisplayed();
		if(actualusernamevisible==true)
		{
			System.out.println("Passed.Username textbox is visible on login page"); 
		}else
		{
			System.out.println("Failed.Username textbox is not visible on login page");
		}
		String actualattibuteusername=username.getAttribute("value");
		String expectedattibuteusername="";
		if(actualattibuteusername.equals(expectedattibuteusername))
		{
			System.out.println("Passed. Usernametext box is blank"); 
		}else
		{
			System.out.println("Passed. Usernametext box is blank");
		}
		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		boolean  actualuserpasswordvisible= userpassword.isDisplayed();
		if(actualuserpasswordvisible==true)
		{
			System.out.println("Passed.Userpassword textbox is visible on login page"); 
		}else
		{
			System.out.println("Failed.Userpassword textbox is not visible on login page");
		}
		String actualattibuteusepassword=userpassword.getAttribute("value");
		String expectedattibuteuserpassword="";
		if(actualattibuteusepassword.equals(expectedattibuteuserpassword))
		{
			System.out.println("Passed. Userpasswordtext box is blank"); 
		}else
		{
			System.out.println("Failed. Userpasswordtext box is not blank");
		}
		WebElement colortheme=driver.findElement(By.xpath("//select[@name='login_theme']"));
		boolean actualvisiblecolortheme=colortheme.isDisplayed();
		if(actualvisiblecolortheme==true)
		{
			System.out.println("Passed. Colortheme is visible on login page");  
		}else
		{
			System.out.println("Failed. Colortheme is not visible on login page");  
		}
		Select selectobj=  new Select(colortheme);
		String  acutalattibutecolortheme=selectobj.getFirstSelectedOption().getAttribute("value");
		String expectedattibutecolortheme="softed";
		if(acutalattibutecolortheme.equals(expectedattibutecolortheme))
		{
			System.out.println("Passed.By default softed is selected in color dropdown");	
		}else
		{
			System.out.println("Failed.By default softed is not selected in color dropdown");	
		}
		WebElement Language=driver.findElement(By.xpath("//select[@name='login_language']"));
		boolean actualvisiblelanguage=Language.isDisplayed();
		if(actualvisiblelanguage==true)
		{
			System.out.println("Passed. Language is visible on login page");  
		}else
		{
			System.out.println("Failed. Language is not visible on login page");  
		}
		Select selectobj1=  new Select(Language);
		String  acutalattibutelanguage=selectobj1.getFirstSelectedOption().getText();
		System.out.println(acutalattibutelanguage);
		String expectedattibutelanguage="US English";
		if(acutalattibutelanguage.equalsIgnoreCase(expectedattibutelanguage))
		{
			System.out.println("Passed.By default US English is selected in Language dropdown");	
		}else
		{
			System.out.println("Failed.By default US English is not selected in Language dropdown");	
		}
		WebElement loginbutton=driver.findElement(By.xpath("//input[@name='Login']"));
		boolean actualvisibleloginbutton= loginbutton.isDisplayed();
		if(actualvisibleloginbutton==true)
		{
			System.out.println("Passed. Login button is visible on login page");  
		}else
		{
			System.out.println("Failed. Login button is not visible on login page");  
		}
		boolean  actualenableloginbutton=loginbutton.isEnabled();
		if(actualenableloginbutton==true)
		{
			System.out.println("Passed. Login button is enable on login page");
		}else
		{
			System.out.println("Failed. Login button is disable on login page"); 
		}

	}
	public static void varifyvalidlogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\PracticeSelenium\\ChandanSir\\driver\\chromedriver.exe");
		ChromeDriver driver=   new ChromeDriver();
		driver.get("http://localhost:8888");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		String    actualattibuteusername=username.getAttribute("value");
		String   expectedattibuteusername="admin";
		if(actualattibuteusername.equals(expectedattibuteusername))
		{
			System.out.println("Passed.admin username is written in username textbox");	
		}else
		{
			System.out.println("Failed.admin username is not written in username textbox");	
		}
		boolean	actualusernamevisibleafterwritten=username.isDisplayed();
		if(actualusernamevisibleafterwritten==true)
		{
			System.out.println("Passed. Usernametext box is visible with written admin");
		}else
		{
			System.out.println("Failed. Usernametext box is not visible with written admin");
		}
		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		userpassword.sendKeys("admin");
		String    actualattibuteuserpassword=userpassword.getAttribute("value");
		String   expectedattibuteuserpassword="admin";
		if(actualattibuteuserpassword.equals(expectedattibuteuserpassword))
		{
			System.out.println("Passed.admin userpassword is masked in userpassword textbox");	
		}else
		{
			System.out.println("Failed.admin userpassword is not masked in userpassword textbox");	
		}
		boolean	actualuserpasswordvisibleafterwritten=userpassword.isDisplayed();
		if(actualuserpasswordvisibleafterwritten==true)
		{
			System.out.println("Passed. Userpasswordtext box is visible with mask ");
		}else
		{
			System.out.println("Failed. Userpasswordtext box is not visible with mask");
		}
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	   WebElement actualhomepage=driver.findElement(By.xpath("//body[@class='small']"));
	 boolean  acutalhomepagevisible=actualhomepage.isDisplayed();
	 if(acutalhomepagevisible==true)
	 {
		System.out.println("Passed Home page is visible"); 
	 }else
	 {
		 System.out.println("Passed Home page is not visible");
	 }
	WebElement Myhomepage=driver.findElement(By.xpath("//a[text()='My Home Page']"));
boolean	actualMyhomepage=Myhomepage.isDisplayed();
if(actualMyhomepage==true)
{
System.out.println("Passed. My home page is visible");	
}else
{
	System.out.println("Failed. My home page is visible");
}
	 
	}

}
