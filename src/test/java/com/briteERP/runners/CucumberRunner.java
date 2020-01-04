package com.briteERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/com/briteERP/step_definitions",
        tags = "@Login",
        dryRun = true,
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }

)


public class CucumberRunner {

}
