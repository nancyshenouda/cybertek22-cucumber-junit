package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import from io.cucumber.java NOT from junit
    @Before
    public void setupScenario(){
        System.out.println("---Setting up browser with further details...");
        // it is executed before each scenario
    }
    // import from io.cucumber.java NOT from junit
    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("----Teardown steps are being applied----");
        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

        //Driver.closeDriver();
        // it is executed after each scenario
    }
    @BeforeStep
    public void setupStep(){
        System.out.println("--- setup applying for each step---");
    }
    @AfterStep
    public void afterStep(){
        System.out.println("---- teardown applying after each step----");
    }
}
