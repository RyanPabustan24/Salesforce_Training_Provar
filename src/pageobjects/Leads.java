package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Leads"                                
     , summary=""
     , relativeUrl=""
     , connection="RovicConnection"
     )             
public class Leads {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='New']")
	public WebElement newBtn;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement saveBtn;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='We hit a snag.']")
	public WebElement errorPrompt;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='salutation']")
	public WebElement SalutationField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='firstName']")
	public WebElement FirstNameField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='lastName']")
	public WebElement LastNameField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Company']")
	public WebElement CompanyField;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//input[@name='Email']")
	public WebElement EmailField;
	@ButtonType()
	@FindBy(xpath = "//button[@name='CancelEdit']")
	public WebElement cancelBtn;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='pipelineInspectionToListView']")
	public WebElement listViewBtn;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='Lead-search-input']")
	public WebElement listSearchField;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Intelligence View']")
	public WebElement intelligenceViewBtn;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='{name}']")
	public WebElement Name;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[contains(normalize-space(.), '{ValidateFirstname}')]")
	public WebElement NameColumn;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Activity']")
	public WebElement activityTab;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Log a CallLog a Call']")
	public WebElement btnLogACall;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New TaskNew Task']")
	public WebElement btnNewTask;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New EventNew Event']")
	public WebElement btnNewEvent;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='EmailEmail']")
	public WebElement btnSendEmail;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Refresh']")
	public WebElement btnRefresh;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Expand All']")
	public WebElement linkExpandOrCollapse;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View All']")
	public WebElement linkViewAll;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='Convert']")
	public WebElement btnConvert;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'modal-container')]")
	public WebElement modalConvertLead;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Account']")
	public WebElement labelAccount;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Contact']")
	public WebElement labelContact;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Opportunity']")
	public WebElement labelOpportunity;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Cancel']")
	public WebElement btnCancelConvert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert']")
	public WebElement btnSubmitConvert;
	@TextType()
	@FindBy(xpath = "//h2[contains(text(),'converted')]/ancestor::div[contains(@class,'modal-container')]")
	public WebElement modalConverted;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leadsTab;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[contains(normalize-space(.),'Spongebob')]")
	public WebElement Name1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show more actions']")
	public WebElement dropdownShowMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Convert']")
	public WebElement btn_Convert;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='{fullname}']")
	public WebElement Name2;
	@LinkType()
	@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@class='slds-truncate'])[1]")
	public WebElement btnName;
	@LinkType()
	@FindBy(xpath = "(//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a)[7]")
	public WebElement opportunity;
	@TextType()
	@FindBy(xpath = "//a[@title='Intelligence View']")
	public WebElement intelligenceViewTab;
			
}
