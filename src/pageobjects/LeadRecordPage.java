package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LeadRecordPage"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class LeadRecordPage {

	@LinkType()
	@FindBy(xpath = "//a[text()='Activity']")
	public WebElement activityTab;
	@TextType()
	@FindBy(xpath = "//span[text()='New Task' and @value='NewTask']")
	public WebElement NewTaskButton;
	@ButtonType()
	@FindBy(xpath = "//button//span[text()='Log a Call' and @value='LogACall']")
	public WebElement LogACallButton;
	@ButtonType()
	@FindBy(xpath = "//button//span[text()='Log a Call' and @value='LogACall']")
	public WebElement LogACallButton1;
	@TextType()
	@FindBy(xpath = "//button//span[text()='Log a Call' and @value='LogACall']")
	public WebElement LogACall;
	@ButtonType()
	@FindBy(xpath = "//button//span[text()='New Event' and @value='NewEvent']")
	public WebElement NewEventButton;
	@ButtonType()
	@FindBy(xpath = "//button//span[text()='Email' and @value='SendEmail']")
	public WebElement EmailButton;
	@TextType()
	@FindBy(xpath = "//button[text()='Refresh']")
	public WebElement refreshLink;
	@TextType()
	@FindBy(xpath = "//button[text()='Expand All']")
	public WebElement expandAllLink;
	@LinkType()
	@FindBy(xpath = "//a[text()='View All']")
	public WebElement viewAllLink;
	@ButtonType()
	@FindBy(xpath = "//button//span[text()='Show more actions']")
	public WebElement showMoreActionsButton;
	@TextType()
	@FindBy(xpath = "//span[text()='Convert']")
	public WebElement ConvertButton;
			
}
