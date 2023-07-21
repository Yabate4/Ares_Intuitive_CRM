package com.crm.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "pretty",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json",
        },

        dryRun = false,
        publish = true,
        tags = "@B29G7-420",
        features = "src/test/resources/features",
        glue =  "com/crm/step_definitions"


)
public class CukesRunner {


}
