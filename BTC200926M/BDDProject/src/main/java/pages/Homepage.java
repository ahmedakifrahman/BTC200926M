package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.SeleniumHelper;

// LOgin Reports
//AJAX
//DATA DRIVEN
		//STEP DEFINITION
		//Test data repository
        
		


public class Homepage {

	
	WebDriver dr;
	
	@FindBy(xpath="whatever xpath") WebElement userbox;
	@FindBy(xpath="whatever xpath") WebElement passbox;
	
	
	
	public void typeUserID() {
		SeleniumHelper.type("", "");
	}

	public void typePass() {
		SeleniumHelper.type("passbox", "ghgedj");

}
	public void clickLogin() {
		SeleniumHelper.type("passbox", "ghgedj");
	
	}
}