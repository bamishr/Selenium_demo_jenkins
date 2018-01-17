package com.example.supercrunch.tests;

import com.example.supercrunch.parameters.WebURL;
import com.example.supercrunch.pageobject.HomePage;
import org.openqa.selenium.Platform;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by New on 3/3/2017.
 */
@Test(dataProvider = "homepage", dataProviderClass = WebURL.class, singleThreaded = true)
public class TestTitle {
    HomePage espn;

    public TestTitle(String browser) throws InterruptedException, MalformedURLException {
        this.espn = new HomePage();
        DesiredCapabilities capabilities = new DesiredCapabilities();

        if(browser.equalsIgnoreCase("chrome")){
            capabilities = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chrome/chromedriver.exe");
            capabilities.setVersion("ANY");
            capabilities.setPlatform(Platform.ANY);
        }
        if(browser.equalsIgnoreCase("internet explorer")) {
            capabilities = DesiredCapabilities.internetExplorer();
            System.setProperty("webdriver.ie.driver", "./src/test/resources/driver/ied/IEDriverServer.exe");
            capabilities.setVersion("ANY");
            capabilities.setPlatform(Platform.ANY);
            capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
        }

        //Selenium Grid URL
        //String url = "https://sathish507:0df095f8-4141-479d-ac5c-405f7f7127f6@ondemand.saucelabs.com:80/wd/hub";
        URL url = new URL("http://localhost:4444/wd/hub");
        espn.setBrowser(new RemoteWebDriver(url,capabilities));

    }
    public void verifyTitle(String url, String expectedTitle) {
        espn.open(url);
        Assert.assertEquals(espn.getTitle(), expectedTitle);
    }

    @AfterClass
    public void tearDown(){
        espn.close();
    }
}