package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;

public class Basetest {

	WebDriver dr;

	public void open_browser(String b) {
		
		 if(b.equals("chrome")) {
	        	dr=new ChromeDriver();
	        	
	        }else if(b.equals("firefox")) {
	        	dr=new FirefoxDriver();
	        }

	
	}

	public Homepage gotoURL() {
		dr.get("https://www.facebook.com");
		return new Homepage(dr);
		
	}
	
	
	
	
	
}
