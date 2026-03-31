package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="MyNewConnection"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Campaigns']")
	public WebElement campaigns;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement App_Launcher;
	@TextType()
	@FindBy(xpath = "//lightning-primitive-input-simple//input")
	public WebElement searchAppsAndItems;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales']")
	public WebElement Click_Sales;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement Leads;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='New']")
	public WebElement NewButton;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='firstName']")
	public WebElement First_Name;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='lastName']")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Company']")
	public WebElement CompanyName;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Email']")
	public WebElement Email;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement saveButton;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement Leads1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='pipelineInspectionToListView']")
	public WebElement listViewButton;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Recently Viewed']")
	public WebElement RecentlyViewed;
	@TextType()
	@FindByLabel(label = "Search lists...")
	public WebElement searchType;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='VWMXJ VWP7M']")
	public WebElement Name;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Activity']")
	public WebElement activity;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New TaskNew Task']")
	public WebElement NewTask;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Log a CallLog a Call']")
	public WebElement LogACall;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New EventNew Event']")
	public WebElement NewEvent;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='EmailEmail']")
	public WebElement SendEmail;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Refresh']")
	public WebElement refresh;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View All']")
	public WebElement viewAll;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Convert']")
	public WebElement Convert;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Account']")
	public WebElement account;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Contact']")
	public WebElement contact;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Opportunity']")
	public WebElement opportunity;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Cancel']")
	public WebElement cancelConvert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert']")
	public WebElement submitConvert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert']")
	public WebElement submitConvertButton;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h2[normalize-space(.)='Your lead has been converted']")
	public WebElement YourLeadsHasBeenConverted;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Cancel and close']")
	public WebElement cancelAndClose;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='WH0C5 WH2HP']")
	public WebElement Name1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='testi-']")
	public WebElement OpportunityLink;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Details']")
	public WebElement detailsTab;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Close Date']")
	public WebElement CloseDate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='CloseDate']")
	public WebElement CloseDate1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement New;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='MNBWH4HU-']")
	public WebElement NameLink;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select a date for Close Date']")
	public WebElement CloseDate2;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='CloseDate']")
	public WebElement EditCloseDate;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next Month']")
	public WebElement CloseDateEDIT;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='CloseDate']")
	public WebElement EditCloseDate1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//textarea")
	public WebElement Description;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='IsPrivate']")
	public WebElement IsPrivate;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='SaveEdit']")
	public WebElement SaveEdit;
	@TextType()
	@FindByLabel(label = "NewTask")
	public WebElement NewTaskUI;
	@TextType()
	@FindByLabel(label = "NewTask")
	public WebElement NewTaskUI1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='ND4OE0J-']")
	public WebElement OpportunityLinkName;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='NDSOEND-']")
	public WebElement OpportunityLinkName1;
	@TextType()
	@FindBy(xpath = "//one-app-launcher-search-bar//lightning-primitive-input-simple//input")
	public WebElement AppLauncherSearch;
			
}
