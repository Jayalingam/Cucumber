package org.automation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class Automation extends BaseClass {

    AutomationPOJO auto = new AutomationPOJO();

    @Given("open automation page and maximize the screen")
    public void open_automation_page_and_maximize_the_screen() {

        openChromeBrowser();
        maxWindow();
        launchUrl("https://testautomationpractice.blogspot.com/");

    }

    @Then("pass a text into text box {string}")
    public void pass_a_text_into_text_box(String keyword) {
//        WebElement textBox = auto.getTextBox();
//       System.out.println(textBox);
////         toFillTextBox(textBox, "1234567890");
        WebElement textBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        toFillTextBox(textBox, keyword);
        // driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("");
    }

    @And("click the search button")
    public void click_the_search_button(){
        driver.findElement(By.className("wikipedia-search-button")).click();

    }

    @And("validate no result found error")
    public void validate_no_result_found_error() throws InterruptedException {
        holdProgram(5000);
        WebElement noResult = driver.findElement((By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]")));
        String searchResult =  noResult.getText();
        Assert.assertEquals("No results found.", searchResult);

    }

    @Then("close the browser")
    public void close_the_browser(){
        driver.close();
    }


    @Then("validate the search results {string}")
    public void validate_the_search_results(String keyword) throws InterruptedException {

        holdProgram(5000);

        WebElement searchResult = driver.findElement(By.xpath("(//div[@id=\"wikipedia-search-result-link\"])[1]"));
        String result = searchResult.getText();
       // Assert.assertEquals(result, keyword);
        Assert.assertEquals("Google", result);
       // System.out.println(result);

    }


}