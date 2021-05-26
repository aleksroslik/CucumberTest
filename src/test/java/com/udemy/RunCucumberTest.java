package com.udemy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/com/udemy/wyplata_pieniedzy.feature", glue = "MyStepdefs")
public class RunCucumberTest {
}