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
	@FindBy(xpath = "//*[text()='Convert Lead ']")
	public WebElement ConvertLeadDisplay;
	@LinkType()
	@FindBy(xpath = "//span[text()='Account']")
	public WebElement accountLabel;
	@LinkType()
	@FindBy(xpath = "//span[text()='Contact']")
	public WebElement contactLabel;
	@LinkType()
	@FindBy(xpath = "//span[text()='Opportunity']")
	public WebElement opportunityLabel;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement cancelConvertButton;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Convert']")
	public WebElement submitConvertButton;
	@TextType()
	@FindBy(xpath = "//*[text()='Your lead has been converted']")
	public WebElement ValidateYourLeadHasBeenConverted;
	@LinkType()
	@FindByLabel(label = "Accenture-", labelType = LabelType.PrecedingCell)
	public WebElement OppurtunityInLeadModal;
	@LinkType()
	@FindBy(xpath = "(//div[contains(@class,'containerConvertedItem')]   [.//div[@title='Account Name']    and .//div[contains(text(),'Close Date')]    and .//div[contains(text(),'Amount')]] //a[@data-refid='recordId'])[1]")
	public WebElement OppLead;
			
}
