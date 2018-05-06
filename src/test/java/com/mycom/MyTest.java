package com.mycom;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Student on 06.05.2018.
 */
public class MyTest {
    @Test
    public void test() throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://korrespondent.net/");
        Assert.assertEquals("https://korrespondent.net/", driver.getCurrentUrl());
        driver.quit();
    }
}
