package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="VallidateLeadRecords"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class VallidateLeadRecords {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select a List View: Leads' and normalize-space(.)='Select a List View: Leads' and contains(@class,'slds-button') and @part='button button-icon' and @title='Select a List View: Leads' and @type='button']")
	public WebElement listSearch;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//lightning-base-combobox//div/input")
	public WebElement searchType;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Select Item 1']/parent::span/parent::td/following-sibling::th//a")
	public WebElement Name;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Activity' and normalize-space(.)='Activity' and @aria-controls='tab-18' and contains(@class,'slds-tabs_default__link') and @data-label='Activity' and @data-tab-value='activityTab' and @role='tab' and normalize-space(.)='Activity' and @aria-selected='true' and @href='javascript:void(0)' and @id='activityTab__item' and @lwc-72usf2nsemu='' and @tabindex='0']")
	public WebElement ACTIVITY_TASK;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Activity']")
	public WebElement GoToList;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Refresh' and normalize-space(.)='Refresh' and contains(@class,'slds-button') and @data-aura-rendered-by='3820:0' and @title='Refresh' and @type='button']")
	public WebElement refresh;
			
}
