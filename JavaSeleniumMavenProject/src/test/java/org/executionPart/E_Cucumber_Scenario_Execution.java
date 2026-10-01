package org.executionPart;


import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resorces/CucuScenario.feature", glue="org.stepdefinition", monochrome=true, plugin={"pretty"})

public class E_Cucumber_Scenario_Execution extends AbstractTestNGCucumberTests {

}
