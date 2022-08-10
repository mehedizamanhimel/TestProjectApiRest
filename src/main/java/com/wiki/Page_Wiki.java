package com.wiki;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Page_Wiki {
    WebDriver driver;

    public Page_Wiki(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }


    @FindBy(id="searchInput")
    public WebElement textField_Search;

    @FindBy(xpath="//*[@id=\"typeahead-suggestions\"]/div/a[1]/div[1]/h3")
    public WebElement resultList_Search;

    @FindBy(xpath="//*[@id=\"search-form\"]/fieldset/button")
    public WebElement button_Search;

    @FindBy(id="searchLanguage")
    public WebElement select_Language;


    public void SelectLanguage(String langauge) throws InterruptedException {
        Select select = new Select(select_Language);
        select.selectByValue(langauge);
    }


    public void SearchWithKeyword(String Keyword){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        textField_Search.sendKeys(Keyword);
        button_Search.click();

    }

}
