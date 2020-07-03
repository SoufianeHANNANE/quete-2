package org.Framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/json/result.json"},
        features = {"src/test/java/org/Framework"},
        glue = {"org.Framework"},
        tags = ""
)
public class AppTest {

}
