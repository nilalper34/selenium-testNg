package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Login']")
    public WebElement ilkLoginButonu;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()=' Login']")
    public WebElement ikinciLoginButonu;

    @FindBy(xpath = "//select[@name='car']")
    public WebElement selectCarDD;

    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUpLocation;

    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement dropOffLocation;

    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement pickUpDate;

    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement pickUpTime;

    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;

    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;

    @FindBy(id = "dropdown-basic-button")
    public WebElement kullaniciProfilIsmi;

}
