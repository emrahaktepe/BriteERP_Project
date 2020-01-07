package com.briteERP.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions (

        features = "@target/rerun.txt",
        glue = "com/briteERP/step_definitions",
        plugin = {"html:target/default-cucumber-reports",

        }
)

public class FailedRunner {


}
