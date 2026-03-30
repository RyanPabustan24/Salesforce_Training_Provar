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
			
}
