package com.wiki.tests;

import com.relevantcodes.extentreports.ExtentTest;
import com.wiki.Page_SearchResult;
import com.wiki.Page_Wiki;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestData;

import java.util.concurrent.TimeUnit;

public class SearchTest_Wiki extends BaseTestClass {

    static TestData testData;

    Page_Wiki wikipage;
    Page_SearchResult searchResultPage;

    ExtentTest test;

    String wikiHomePage = "https://www.wikipedia.org";
    String searchKeyword = "Apollo 11";


    @Test(priority = 0, invocationCount = 1, description="Verify that search is working properly")
    public  void Verify_Search_Working_ValidData_English() throws InterruptedException {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);
        test = new ExtentTest("TestCaseName","Verify that Search is working properly");

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get(wikiHomePage);
        wikipage.SearchWithKeyword(searchKeyword);

        Assert.assertEquals(searchResultPage.getSearchResult(), searchKeyword);
        String PageTitle = driver.getTitle();
        Assert.assertEquals(PageTitle, "Apollo 11 - Wikipedia");

    }

    @Test(priority = 1, invocationCount = 1, description="Verify that search is working properly")
    public  void Verify_Search_Working_ValidData_Bangla() throws InterruptedException {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);
        test = new ExtentTest("TestCaseName","Verify that Search is working properly");

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get(wikiHomePage);
        wikipage.SelectLanguage("bn");
        wikipage.SearchWithKeyword("অ্যাপোলো ১১");

        Assert.assertEquals(searchResultPage.getSearchResult(), "অ্যাপোলো ১১");
        //test.addScreenCapture("target");
    }
}
