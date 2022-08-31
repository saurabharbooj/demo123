package PageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class orangeHRMEndToEnd extends BaseClass{
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickonloginbutton;
	
	@FindBy(xpath="//img[@alt='client brand banner']")
	WebElement checklogo;
	
	
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement clickonpimlink;
	
	
	
	@FindBy(xpath="//*[text()=' Add ']")
	WebElement clickonaddbutton;
	
	@FindBy(xpath="//inut[@name='firstName']")
	WebElement fname;
	
	@FindBy(xpath="//inut[@name='middleName']")
	WebElement mname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lname;
	
	@FindBy(xpath="//*[text()=' Save ']")
	WebElement clickonsavebtn;
	
	
	
	public orangeHRMEndToEnd()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterAllValue(String username, String password )
	{
		uname.sendKeys(username);
		pass.sendKeys(password);	
	}
	
	public void clickloginbtn()
	{
		clickonloginbutton.click();
	}
	
	public boolean checklogo()
	{
		return checklogo.isDisplayed();
	}
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	public String geturl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	public void pimpageclick()
	{
		clickonpimlink.click();
	}
	
	public void addbtn()
	{
		clickonaddbutton.click();
	}
	
	public void pimlogin(String firstname,String middlename, String lastname)
	{
		fname.sendKeys(firstname);
		mname.sendKeys(middlename);
		lname.sendKeys(lastname);
		
	}
	
	public void savebtn()
	{
		clickonsavebtn.click();
	}

}
