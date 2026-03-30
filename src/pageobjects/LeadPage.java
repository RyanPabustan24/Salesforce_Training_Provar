package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadPage"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class LeadPage {

	@LinkType()
	@FindBy(xpath = "//button[text()='New']")
	public WebElement NewButton;
	@ButtonType()
	@FindBy(xpath = "//button[text()='List View']")
	public WebElement listViewButton;
	@TextType()
	@FindBy(xpath = "//lightning-base-combobox//span[text()='Recently Viewed (Pinned list)' or span[text()='Recently Viewed'] ]")
	public WebElement searchType;
	@ButtonType()
	@FindByLabel(label = "Select a List View: Leads")
	public WebElement SelectList;
	@TextType()
	@FindBy(xpath = "//tr[.//span[text()='Nathaniel Miguel']]//a//span[text()='Nathaniel Miguel']")
	public WebElement RecentlyLeadRecord;
	@TextType()
	@FindBy(xpath = "//label[.//span='Start Date']//following-sibling::*//input")
	public WebElement StartDate;
			
}
