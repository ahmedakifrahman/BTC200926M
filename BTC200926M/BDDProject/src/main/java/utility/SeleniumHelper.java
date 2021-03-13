package utility;

import org.openqa.selenium.WebElement;

public class SeleniumHelper {

	public static void type(String string, String text) {
              string.sendKeys(text);
	}
}
