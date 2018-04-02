package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookStepTest {   // Write code here that turns the phrase above into concrete actions

    private WebDriver driver = null;

    private void initializeDriver() {
        driver = new ChromeDriver();
        // take chrome to front window.
        String parent_window = driver.getWindowHandle();
        driver.switchTo().window(parent_window);
    }

    @Given("^the facebook page is open \"([^\"]*)\"$")
    public void the_facebook_page_is_open(String page) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        initializeDriver();
        driver.get(page);
    }

    @Given("^I want to set my login in firstName as \"([^\"]*)\"$")
    public void i_want_to_set_my_login_in_firstName_as(String firstName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys(firstName);
    }

    @Given("^I want to set my login in secondName as \"([^\"]*)\"$")
    public void i_want_to_set_my_login_in_secondName_as(String secondName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement name = driver.findElement(By.name("lastname"));
        name.sendKeys(secondName);
    }

    @When("^I want to set my register mobile number as \"([^\"]*)\"$")
    public void i_want_to_set_my_register_mobile_number_as(String mobileNumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement name = driver.findElement(By.name("reg_email__"));
        name.sendKeys(mobileNumber);
    }

    @Then("^Set a register pass word as (\\d+)$")
    public void set_a_register_pass_word_as(String passWord) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement name = driver.findElement(By.name("reg_passwd__"));
        name.sendKeys(passWord);
    }


    @Then("^Set a register male as \"([^\"]*)\"$")
    public void set_a_register_male_as(String sex) throws Throwable {
        ((JavascriptExecutor)driver).executeScript("$('#sex').click();");
    }

}
