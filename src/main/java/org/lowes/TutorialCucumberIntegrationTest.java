package org.lowes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/tutorials",
        plugin = {"pretty", "html:target/cucumber/tutorials"},
        extraGlue = "org.lowes.commons")
public class TutorialCucumberIntegrationTest {}
