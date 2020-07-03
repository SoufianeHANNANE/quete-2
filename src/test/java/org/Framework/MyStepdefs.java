package org.Framework;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    WebDriver driver;

    @When("I lookup the word {string}")
    public void iLookupTheWord(String arg0) {
        System.setProperty("webDriver.chrome.chrome.driver","src/test/Java/org/framework/ChromeDriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com/");

    }

    @Then("search result display the word {string}")
    public void searchResultDisplayTheWord(String arg0) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.clear();
        searchBox.sendKeys(arg0);
        searchBox.submit();
        driver.quit();
    }

    @When("I type {string} in search bar")
    public void iTypeInSearchBar(String arg0) {
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
    }


    @Then("{string} should be mentioned in the results")
    public void shouldBeMentionedInTheResults(String arg0) {
    }

    @Given("I open Google search page")
    public void iOpenGoogleSearchPage() {
    }
}
