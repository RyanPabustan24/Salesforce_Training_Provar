package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ConvertLeadModal"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class ConvertLeadModal {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h1[normalize-space(.)='Convert Lead']")
	public WebElement ConvertLeadModal;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h2[normalize-space(.)='Your lead has been converted']")
	public WebElement Your_lead_has_been_converted;
			
}
