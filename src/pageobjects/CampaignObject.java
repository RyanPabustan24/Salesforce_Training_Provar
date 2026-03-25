package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CampaignObject"                                
     , summary=""
     , relativeUrl=""
     , connection="NewConnection"
     )             
public class CampaignObject {

	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns List']//span//g")
	public WebElement tabCampaign;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns List']//span/lightning-primitive-icon")
	public WebElement tabCampaign1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement btnNew;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='New Campaign']")
	public WebElement newCampaign;
			
}
