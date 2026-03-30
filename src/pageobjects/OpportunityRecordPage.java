package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="OpportunityRecordPage"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class OpportunityRecordPage {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Details']")
	public WebElement detailsTab;
	@ButtonType()
	@FindBy(xpath = "//span[text()='Edit Opportunity Name']")
	public WebElement CloseDatePencil;
	@TextType()
	@FindBy(xpath = "//label[text()='Close Date']//following-sibling::*//input")
	public WebElement CloseDateInput;
	@TextType()
	@FindBy(xpath = "//span[text()='Close Date']/ancestor::records-record-layout-item//lightning-formatted-text")
	public WebElement CloseDatePencilVar;
	@ButtonType()
	@FindBy(xpath = "//button[span[text()='Edit Close Date']]")
	public WebElement CloseDatePencil1;
	@TextType()
	@FindBy(xpath = " //records-record-layout-item[@field-label='Description']//textarea")
	public WebElement DescriptionInput;
	@ButtonType()
	@FindBy(xpath = "//button[text()='Save']")
	public WebElement SaveEdit;
	@BooleanType()
	@FindBy(xpath = "//input[@name='IsPrivate']")
	public WebElement PrivateCheckBox;
	@ButtonType()
	@FindBy(xpath = "//button[span[text()='Edit Stage']]")
	public WebElement StageNamePencil;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//sfa-input-stage-name//lightning-combobox//lightning-base-combobox//div/div/button")
	public WebElement StageNameEdit;
	@TextType()
	@FindBy(xpath = "//span[text()='Stage']/ancestor::records-record-layout-item//lightning-formatted-text")
	public WebElement StageValue;
			
}
