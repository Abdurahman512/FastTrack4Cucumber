package com.cydeo.runner;


import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cydeo/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedTestRunner {
}
