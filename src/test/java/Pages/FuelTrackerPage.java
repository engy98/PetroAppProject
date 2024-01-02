package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FuelTrackerPage {

    WebDriver driver;


    public FuelTrackerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(name = "carNumber")
    WebElement carNumber;

    @FindBy(name="fuelInLiters")
    WebElement fuelInLiters;

    @FindBy(name="fuelCost")
    WebElement fuelCost;

    @FindBy(name="fuelType")
    WebElement fuelType;

    @FindBy(name = "dateAndTime")
    WebElement dateAndTime;

    @FindBy(name = "companyId")
    WebElement companyId;

    @FindBy(tagName = "button")
    WebElement addButton;


    public void enterCarNumber(String carNumber){
        this.carNumber.clear();
        this.carNumber.sendKeys(carNumber);
    }

    public void enterFuelInLiters(String fuelInLiters){

        this.fuelInLiters.clear();
        this.fuelInLiters.sendKeys(fuelInLiters);
    }

    public void enterFuelCost(String fuelCost){

        this.fuelCost.clear();
        this.fuelCost.sendKeys(fuelCost);
    }

    public void enterFuelType(String fuelType){

        this.fuelType.clear();
        this.fuelType.sendKeys(fuelType);
    }
    public void enterDateAndTime(String dateAndTime){

        this.dateAndTime.sendKeys(dateAndTime);
    }
    public void enterCompanyId(String companyId){

        this.companyId.clear();
        this.companyId.sendKeys(companyId);
    }

    public void pressAddButton(){

        addButton.click();
    }

    public void checkCompanyId(String id)
    {
        Assert.assertTrue(driver.findElement(By.cssSelector("#root > div > table > tbody > tr > td:nth-child(6)")).getText().contains(id));
    }

    public void checkDeleteBtn()
    {
        Assert.assertTrue(driver.findElement(By.cssSelector("#root > div > table > tbody > tr > td:nth-child(7) > button")).getText().contains("Delete"));
    }

    public void pressDeleteBtn()
    {
        driver.findElement(By.cssSelector("#root > div > table > tbody > tr > td:nth-child(7) > button")).click();
    }



}




