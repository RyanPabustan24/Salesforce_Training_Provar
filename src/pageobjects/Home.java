package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Home"                                
     , summary=""
     , relativeUrl=""
     , connection="RovicConnection"
     )             
public class Home {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leadsTab;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Opportunities']")
	public WebElement opportunitiesTab;
			
}
