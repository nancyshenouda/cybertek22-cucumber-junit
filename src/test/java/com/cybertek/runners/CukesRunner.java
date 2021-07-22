package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "@wip"  // "or" checks either side of the tags there in the feature file and execute it
                                        // "and" both tags must be there or true to execute any of them

)
public class CukesRunner {

}
