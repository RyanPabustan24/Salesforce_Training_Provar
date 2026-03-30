package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadsPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class LeadsPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement New;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='We hit a snag.']")
	public WebElement pageErrors;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Lead Status']/parent::span/following-sibling::div[1]//button")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='salutation']")
	public WebElement Salutation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='firstName']")
	public WebElement FirstName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='lastName']")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Company']")
	public WebElement Company;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Email']")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='We hit a snag.']")
	public WebElement Validation;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close error dialog']")
	public WebElement closeErrorDialog;
	@LinkType()
	@FindBy(xpath = "//span[@title ='Recently Viewed Leads']")
	public WebElement RecentlyViewedLeads;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select a List View: Leads']")
	public WebElement searchType;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='RH21L AH21P']")
	public WebElement Name;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Activity']")
	public WebElement activity;
	@ButtonType()
	@FindBy(xpath = "//span[@value = 'LogACall']")
	public WebElement ValidateLogACall;
	@ButtonType()
	@FindBy(xpath = "//span[@value = 'NewTask']")
	public WebElement ValidateNewTask;
	@ButtonType()
	@FindBy(xpath = "//span[@value = 'NewEvent']")
	public WebElement ValidateNewEvent;
	@ButtonType()
	@FindBy(xpath = "//span[@value = 'SendEmail']")
	public WebElement ValidateSendEmail;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Refresh']")
	public WebElement ValidateRefresh;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Expand All']")
	public WebElement ValidateExpandOrCollapse;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View All']")
	public WebElement ValidateViewAll;
			
}
