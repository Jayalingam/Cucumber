package org.automation;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AutomationPOJO extends BaseClass {

public AutomationPOJO()
{
    PageFactory.initElements( driver, this);
}

    @FindBy(id="Wikipedia1_wikipedia-search-input")
    private WebElement searchBox;

    @FindBy(className ="wikipedia-search-button")
    private WebElement searchButton;


    public WebElement getTextBox() {
        return searchBox;
    }
}
