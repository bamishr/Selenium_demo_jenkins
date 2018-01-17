package com.example.supercrunch.tests;

import com.example.supercrunch.parameters.SupportedBrowsers;
import org.testng.annotations.Factory;

import java.net.MalformedURLException;

/**
 * Created by New on 3/6/2017.
 */
public class WebTestFactory{
    @Factory
    public Object[] browserInstances() throws MalformedURLException, InterruptedException {
        String[] browsers = SupportedBrowsers.browsers;
        Object[] result = new Object[browsers.length];
        for(int i =0; i<browsers.length; i++){
            result[i] = new TestTitle(browsers[i]);
        }

        return result;
    }
}