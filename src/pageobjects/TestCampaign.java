package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="TestCampaign"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class TestCampaign {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns']")
	public WebElement TestCampaign;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/lightning-formatted-text")
	public WebElement pageTitle;
			
}
