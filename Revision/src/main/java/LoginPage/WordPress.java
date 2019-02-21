package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WordPress {

	WebDriver driver;
	
	public WordPress(WebDriver driver) {
		
		this.driver=driver;
	}
	
	@FindBy(how=How.ID,using="user_login")WebElement userId;
	
	@FindBy(how=How.NAME,using="pwd")WebElement passId;
	
	@FindBy(how=How.ID,using="wp-submit")WebElement button;
	
	public void veryUser(String user,String pass) {
		
		userId.sendKeys(user);
		
		passId.sendKeys(pass);
		
		button.click();
		
	}
}
