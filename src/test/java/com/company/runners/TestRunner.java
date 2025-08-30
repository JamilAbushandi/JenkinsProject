package com.company.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/company/stepDefs",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@PSM-01"
)
public class TestRunner {
}
