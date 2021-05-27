package com.udemy;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/com/udemy/logowanie.feature",
        glue = "src/test/java/com/udemy/LogowanieSteps")
public class RunLogInTest {
}