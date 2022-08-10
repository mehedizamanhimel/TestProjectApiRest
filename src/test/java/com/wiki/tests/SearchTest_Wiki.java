package com.wiki.tests;


import com.wiki.Page_SearchResult;
import com.wiki.Page_Wiki;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.TestData;


public class SearchTest_Wiki extends BaseTestClass {

    static TestData testData;

    Page_Wiki wikipage;
    Page_SearchResult searchResultPage;



    String wikiHomePage = "https://www.wikipedia.org";
    String searchKeyword = "Apollo 11";


    @Test(priority = 0, invocationCount = 1, description="Verify that search is working properly")
    @Parameters("browser")
    public  void Verify_Search_Working_ValidData_English() throws InterruptedException {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);


        driver.get(wikiHomePage);
        System.out.println("Page Open Successfully");
        wikipage.SearchWithKeyword(searchKeyword);


        Assert.assertEquals(searchResultPage.getSearchResult(), searchKeyword);
        String PageTitle = driver.getTitle();
        Assert.assertEquals(PageTitle, "Apollo 11 - Wikipedia");

    }

    @Test(priority = 1, invocationCount = 1, description="Verify that search is working properly")
    @Parameters("browser")
    public  void Verify_Search_Working_ValidData_Bangla() throws InterruptedException {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);


        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get(wikiHomePage);
        System.out.println("Page Open Successfully");
        wikipage.SelectLanguage("bn");
        System.out.println("Language selected Successfully");
        wikipage.SearchWithKeyword("অ্যাপোলো ১১");
        System.out.println("Result Open Successfully");

        Assert.assertEquals(searchResultPage.getSearchResult(), "অ্যাপোলো ১১");
        //test.addScreenCapture("target");
    }

    @Test(priority = 2, invocationCount = 1, description="Verify that search is working properly")
    public  void Verify_Search_Working_ValidData_EnglishToBangla_NegativeTesting() throws InterruptedException {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);


        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get(wikiHomePage);
        System.out.println("Language selected Successfully");
        wikipage.SearchWithKeyword("অ্যাপোলো ১১");
        System.out.println("Result Open Successfully");

        Assert.assertEquals(searchResultPage.getSearchResult(), "Search results");
        //test.addScreenCapture("target");
    }
}
