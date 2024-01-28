package com.opencart.demo.tests;

import com.opencart.demo.Homepage_DemoOpenCart;
import com.relevantcodes.extentreports.ExtentTest;

import com.wiki.tests.BaseTestClass;
import org.testng.annotations.Test;


public class InitialTests_DemoOpenCart extends BaseTestClass {


    ExtentTest logger;


    String baseUrl = "https://demo.opencart.com/";

    Homepage_DemoOpenCart homepageDemoOpenCart;

    @Test
    public void verify_FirstTest() throws InterruptedException {
        homepageDemoOpenCart = new Homepage_DemoOpenCart(driver);
        driver.get(baseUrl);
        Thread.sleep(1000);
        homepageDemoOpenCart.write_Data("iphone");
        Thread.sleep(2000);
        homepageDemoOpenCart.ClickElement(homepageDemoOpenCart.button_search);
        Thread.sleep(2000);

    }


}
