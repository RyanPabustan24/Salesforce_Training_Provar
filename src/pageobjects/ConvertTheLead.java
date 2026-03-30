package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ConvertTheLead"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class ConvertTheLead {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Refresh']")
	public WebElement refresh;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Convert' and normalize-space(.)='Convert' and @aria-disabled='false' and @href='javascript:void(0)' and @lwc-2n594o4uv8m='' and @role='menuitem' and @tabindex='-1']")
	public WebElement Convert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert' and normalize-space(.)='Convert' and contains(@class,'slds-button') and @data-aura-rendered-by='1322:0' and @type='button']")
	public WebElement submitConvert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert' and normalize-space(.)='Convert' and contains(@class,'slds-button') and @data-aura-rendered-by='3005:0' and @type='button']")
	public WebElement submitConvert1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h2[normalize-space(.)='Your lead has been converted' and normalize-space(.)='Your lead has been converted' and @data-aura-rendered-by='31:3174;a' and @tabindex='-1']")
	public WebElement Your_lead_has_been_converted;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h2[normalize-space(.)='Your lead has been converted']")
	public WebElement Your_lead_has_been_converted1;
			
}
