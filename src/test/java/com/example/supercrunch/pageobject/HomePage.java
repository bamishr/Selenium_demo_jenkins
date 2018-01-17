package com.example.supercrunch.pageobject;

import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public void setBrowser(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void open(String url){
        driver.get(url);
    }

    public void close(){
        driver.quit();
    }
}