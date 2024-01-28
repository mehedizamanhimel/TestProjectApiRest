package com.opencart.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_DemoOpenCart {

    WebDriver driver;
    public Homepage_DemoOpenCart(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[4]/a")
    public WebElement button_Menu;

    @FindBy(name = "search")
    public WebElement textField_menuButton;

    @FindBy(xpath= "//*[@id=\"search\"]/button")
    public WebElement button_search;

    public void ClickElement(WebElement element){
        element.isDisplayed();
        element.click();
    }

    public void write_Data(String data){
        textField_menuButton.sendKeys(data);
    }

}
