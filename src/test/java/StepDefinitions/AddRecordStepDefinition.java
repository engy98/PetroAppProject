package StepDefinitions;

import Pages.FuelTrackerPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRecordStepDefinition {

    WebDriver driver;

    FuelTrackerPage page;


    @Before
    public void openBrowser()
    {
        System.setProperty("webdriver.crome.driver","D:\\PetroApp\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        page=new FuelTrackerPage(driver);
    }
    @Given("User navigates to the Fuel Tracker page")
    public void navigate() throws InterruptedException {

        driver.navigate().to("http://hiring.petroapp.com/test2.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @When("^User enters the Car Number \"(.*)\"$")
    public void enterCarNum(String carNumber) throws InterruptedException {
        page.enterCarNumber(carNumber);
        Thread.sleep(2000);
    }
    @And("^User enters the Fuel in Liters \"(.*)\"$")
    public void entersTheFuelInLiters(String fuelInLiters) throws InterruptedException {
        page.enterFuelInLiters(fuelInLiters);
    }
    @And("^User enters the Fuel Cost \"(.*)\"$")
    public void entersFuelCost( String cost) throws InterruptedException {
        page.enterFuelCost(cost);
    }
    @And("^User enters the Fuel Type \"(.*)\"$")
    public void entersFuelTyp(String type) throws InterruptedException {
        page.enterFuelType(type);
    }
    @And("^User enters the Date and Time \"(.*)\"$")
    public void entersDateAndTime(String DateAndTime) throws InterruptedException {
        page.enterDateAndTime(DateAndTime);
    }

    @And("^User enters the Customer Company Id \"(.*)\"$")
    public void entersCompanyId(String CompanyId) throws InterruptedException {
        page.enterCompanyId(CompanyId);
    }
    @And("User press Add button")
    public void pressAddBtn() throws InterruptedException {
        page.pressAddButton();
        Thread.sleep(2000);
    }

    @Then("^The record will be added and the user can see the delete button and the data he entered for example company id \"(.*)\"$")
    public void checkRecordAddition(String id)
    {
        page.checkCompanyId(id);
        page.checkDeleteBtn();
    }

    @And("User click on the Delete button")
    public void pressDeleteBtn() throws InterruptedException {
        Thread.sleep(2000);
        page.pressDeleteBtn();
        Thread.sleep(2000);
    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }


}




