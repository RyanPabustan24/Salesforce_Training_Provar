package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="MyConnection"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns']")
	public WebElement campaigns;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='24']")
	public WebElement tUE;
	@TextType()
	@FindBy(xpath = "//td[6]/span[normalize-space(.)='3']")
	public WebElement fRI;
			
}
