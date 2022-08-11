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

    Page_Wiki wikipage;
    Page_SearchResult searchResultPage;
    ExtentTest logger;


    String wikiHomePage = "https://www.wikipedia.org";
    String searchKeyword = "Apollo 11";


    @Test(priority = 0, invocationCount = 1, description="Verify that search is working properly")
    public  void Verify_Search_Working_ValidData_English() {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);
        logger = extent.startTest("Test started for Verifying that search is working properly in English");
        driver.get(wikiHomePage);

        logger.log(LogStatus.PASS,"Opening url","Opening the wiki homepage works properly");

        wikipage.SearchWithKeyword(searchKeyword);

        logger.log(LogStatus.PASS, "Page opened with result" , "Search result with Apollo 11 opened successfully");

        Assert.assertEquals(searchResultPage.getSearchResult(), searchKeyword);

        String PageTitle = driver.getTitle();

        Assert.assertEquals(PageTitle, "Apollo 11 - Wikipedia");

        if(PageTitle.equals("Apollo 11 - Wikipedia")){
            logger.log(LogStatus.PASS, "Title matches to search result" , "");
        }

        else {
            logger.log(LogStatus.FAIL, "No matching title found", "That means the page opened doesn't consist of search result.");
        }

        extent.endTest(logger);

    }

    @Test(priority = 1, invocationCount = 1, description="Verify that search is working properly")
    public  void Verify_Search_Working_ValidData_Bangla() throws InterruptedException {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);


        logger = extent.startTest("Test started for Verifying that search is working properly in Bangla");

        driver.get(wikiHomePage);

        logger.log(LogStatus.PASS,"Opening url","Opening the wiki homepage works properly");

        wikipage.SelectLanguage("bn");

        wikipage.SearchWithKeyword("অ্যাপোলো ১১");
        logger.log(LogStatus.PASS, "Search result with Apollo 11 in Bangla opened successfully");

        Assert.assertEquals(searchResultPage.getSearchResult(), "অ্যাপোলো ১১");
        logger.log(LogStatus.PASS, "Test Completed successfully");

        extent.endTest(logger);
    }

    @Test(priority = 2, invocationCount = 1, description="Verify that search is working properly")
    public  void Verify_Search_Working_ValidData_EnglishToBangla_NegativeTesting()  {
        wikipage = new Page_Wiki(driver);
        searchResultPage = new Page_SearchResult(driver);

        logger = extent.startTest("Test started for negative search test cases" );

        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.get(wikiHomePage);

        logger.log(LogStatus.PASS,"Opening url","Opening the wiki homepage works properly");

        wikipage.SearchWithKeyword("অ্যাপোলো ১১");

        logger.log(LogStatus.PASS , "Search result with Apollo 11 in Bangla opened successfully");


        Assert.assertEquals(searchResultPage.getSearchResult(), "Search results");
        logger.log(LogStatus.PASS, "Test Completed successfully for negative case");

        extent.endTest(logger);
    }
}
