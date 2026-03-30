package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ErrorHandlingValidation"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceAdmin"
     )             
public class ErrorHandlingValidation {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='We hit a snag.']")
	public WebElement ErrorValidation;
	@ButtonType()
	@FindBy(xpath = "//one-app-launcher-header/button")
	public WebElement appLauncher;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Sales']")
	public WebElement sales;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Leads']")
	public WebElement leads;
	@TextType()
	@FindBy(xpath = "//one-app-launcher-search-bar//lightning-primitive-input-simple//div/input")
	public WebElement searchAppsAndItems;
			
}
