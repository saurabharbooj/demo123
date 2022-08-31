package StepDefination;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.orangeHRMEndToEnd;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class registerPageTest extends BaseClass {
	
	public static orangeHRMEndToEnd orangehrmendtoend;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   BaseClass.inti();
	}
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password()
	{
		new orangeHRMEndToEnd().enterAllValue("Admin", "admin123");
		new orangeHRMEndToEnd().clickloginbtn();
	}

	@Then("validate home page title")
	public void validate_home_page_title() 
	{
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@Then("validate home page url")
	public void validate_home_page_url() 
	{
		Assert.assertEquals(driver.getCurrentUrl().contains("hrm"), true);
		
	}
	
	@Then("validate home page logo")
	public void validate_home_page_logo() 
	{
		boolean a = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertEquals(a, true);
		
	}
	
	

	@When("user click on pim link")
	public void user_click_on_pim_link() {
		orangehrmendtoend = new orangeHRMEndToEnd();
		
		orangehrmendtoend.pimpageclick();
		
		
	    
	}
	@Then("user will be pim page")
	public void user_will_be_pim_page() {
		
		System.out.println("user is on pimpage");
	    
	}


	
	@Then("user click on add button")
	public void user_click_on_add_button() 
	{
		new orangeHRMEndToEnd().addbtn();
	}
	
	
	@Then("user enter firstname, middlename and last name")
	public void user_enter_firstname_middlename_and_last_name() {
		orangehrmendtoend.pimlogin("saurabh", "ratnakar", "arbuj");
	}	
	

	
	@Then("user click on save button")
	public void user_click_on_save_button() 
	{
		orangehrmendtoend.savebtn();
	} 




}
