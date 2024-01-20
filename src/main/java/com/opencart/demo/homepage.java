package com.opencart.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

    WebDriver driver;
    public homepage(WebDriver driver){
        driver=this.driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "")
    public WebElement button_Menu;

    @FindBy(xpath = "")
    public WebElement textField_menuButton;

    public void ClickMenu(){
        button_Menu.click();
    }

    public void write_Data(String data){
        textField_menuButton.sendKeys(data);
    }

}
