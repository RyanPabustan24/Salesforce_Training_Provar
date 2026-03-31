package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Opportunities"                                
     , summary=""
     , relativeUrl=""
     , connection="NewConnection"
     )             
public class Opportunities {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Opportunities']")
	public WebElement opportunities;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='CompanyJ6WU1-']")
	public WebElement linkOpportunity;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//p")
	public WebElement row;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//slot[@name='primaryField']/lightning-formatted-text")
	public WebElement txtTitle;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Details']")
	public WebElement lnkDetails;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Close Date']")
	public WebElement CloseDate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='CloseDate']")
	public WebElement CloseDate1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='CloseDate']")
	public WebElement populateCloseDate;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//textarea")
	public WebElement txtDescription;
	@BooleanType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@name='IsPrivate']")
	public WebElement boleanIsPrivate;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='SaveEdit']")
	public WebElement OpSaveEdit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//sfa-input-stage-name//lightning-combobox//lightning-base-combobox//div/div/button")
	public WebElement txtStageName;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Stage History(3)']")
	public WebElement validateOpportunityHistories;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Edit Stage']")
	public WebElement btnStageName;
			
}
