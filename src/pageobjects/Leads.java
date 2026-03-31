package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Leads"                                
     , summary=""
     , relativeUrl=""
     , connection="NewConnection"
     )             
public class Leads {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='New']")
	public WebElement btnNew;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement btnSave;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='We hit a snag.']")
	public WebElement errorMsg;
	@TextType()
	@FindBy(xpath = "//button[@name='salutation']")
	public WebElement btnSalutation;
	@TextType()
	@FindBy(xpath = "//input[@name='firstName']")
	public WebElement txtFirstName;
	@TextType()
	@FindBy(xpath = "//input[@name='lastName']")
	public WebElement txtLastName;
	@TextType()
	@FindBy(xpath = "//input[@name='Company']")
	public WebElement txtCompany;
	@TextType()
	@FindBy(xpath = "//input[@name='Email']")
	public WebElement txtEmail;
	@TextType()
	@FindByLabel(label = "Lead Status")
	public WebElement btnStatus;
	@ButtonType()
	@FindBy(xpath = "//button[@name='SaveEdit']")
	public WebElement btnSave1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Recently Viewed Leads']")
	public WebElement btnsearchType;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='fFNameH7SPE LNameH7SPJ']")
	public WebElement txtName;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Activity']")
	public WebElement tabActivity;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New TaskNew Task']")
	public WebElement btnNewTask;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement btnClose;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Log a CallLog a Call']")
	public WebElement btnLogACall;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='New EventNew Event']")
	public WebElement btnNewEvent;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='EmailEmail']")
	public WebElement btnSendEmail;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Refresh']")
	public WebElement btnRefresh;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Converted']")
	public WebElement tabPathAssistantStep_Converted;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Mark Status as Complete']")
	public WebElement tabPath_Convert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Mark Status as Complete']")
	public WebElement btnMarkStatusComplete;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Account Name*']/following-sibling::input")
	public WebElement verifyAccountName;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Convert']")
	public WebElement submitConvertLead;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Go to Leads']")
	public WebElement convertedGoToLeads;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[@name='SaveEdit']")
	public WebElement btnSave2;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close error dialog']")
	public WebElement btnCloseErrorDialog;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select a List View: Leads']")
	public WebElement btnListView;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='fFNameJ6WTP LNameJ6WTV']")
	public WebElement leadName;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']")
	public WebElement btnEmailClose;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Converted']")
	public WebElement tabConvert;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Select Converted Status']")
	public WebElement PathAssistantStep_SelectConvertedStatus;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h1[normalize-space(.)='Convert Lead']")
	public WebElement txtConverLead;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Account']")
	public WebElement ValidateAccount;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Contact']")
	public WebElement ValidateContact;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//a[normalize-space(.)='Opportunity']")
	public WebElement ValidateOpportunity;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//h2[normalize-space(.)='Your lead has been converted']")
	public WebElement ValidateConvertedModal;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Cancel and close']")
	public WebElement ConvertcancelAndClose;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='fFNameJUMT6 LNameJUMTC']")
	public WebElement lnkName;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='fFNameW0C3B LNameW0C3H']")
	public WebElement lnkName1;
			
}
