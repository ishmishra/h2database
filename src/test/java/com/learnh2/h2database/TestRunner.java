package com.learnh2.h2database;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/",
        glue = {"stepDefs"},
        dryRun = false)
public class TestRunner {

}