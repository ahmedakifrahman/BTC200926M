package StepPack;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Basetest;
import pages.Homepage;
import pages.Profilepage;

public class StepDefinition {

	WebDriver dr;
	
	
	Basetest b= new Basetest();
	@Given("^Open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
	    List<List<String>> browsers=arg1.raw();
	    String b=browsers.get(0).get(1);
	        if(b.equals("chrome")) {
	        	dr=new ChromeDriver();
	        	
	        }else if(b.equals("firefox")) {
	        	dr=new FirefoxDriver();
	        }
	
	        // for map , row will be based on index number and column will be based 
	       // on the key name
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	   dr.get("https://www.facebook.com");
	}

	@When("^user type userID in user text box$")
	public void user_type_userID_in_user_text_box() throws Throwable {
	   hp.
	}

	@When("^usertype userID in textbox$")
	public void usertype_userID_in_textbox() throws Throwable {
	    
	}

	@When("^usertype password in textbox$")
	public void usertype_password_in_textbox() throws Throwable {
	  
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   
	}

	@Then("^user should land in his profile page$")
	public void user_should_land_in_his_profile_page() throws Throwable {
	   
	}

	@Then("^user should not land in his profile page$")
	public void user_should_not_land_in_his_profile_page() throws Throwable {
	    
	}
}
