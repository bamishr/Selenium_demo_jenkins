package com.example.supercrunch.parameters;

import org.testng.annotations.DataProvider;

/**
 * Created by New on 3/4/2017.
 */
public class WebURL {
    @DataProvider(name = "homepage")
    public static Object[][] createData() {
        return new Object[][]{
                {"http://www.espn.com/", "ESPN: The Worldwide Leader in Sports"}, {"http://www.espncricinfo.com/", "Live cricket scores, commentary, match coverage | Cricket news, statistics | ESPN Cricinfo"}
        };
    }
}