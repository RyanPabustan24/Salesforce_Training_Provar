package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="GlobalHeader"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class GlobalHeader {

	@LinkType()
	@FindBy(xpath = "//a[.//span[text()='Leads']]")
	public WebElement leadsTab;
			
}
