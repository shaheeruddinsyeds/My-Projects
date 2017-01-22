package com.shaheer;

import org.junit.runner.RunWith;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = "com.testscript", plugin = {"html:target/cucumber-html-report"})
public class TestRunner {

}
