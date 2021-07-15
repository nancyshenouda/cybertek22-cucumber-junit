package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    // import from io.cucumber.java NOT from junit
    @Before
    public void setupScenario(){
        System.out.println("---Setting up browser with further details...");
        // it is executed before each scenario
    }
    // import from io.cucumber.java NOT from junit
    @After
    public void tearDownScenario(){
        System.out.println("----Teardown steps are being applied----");
        Driver.closeDriver();
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
