package runner;

import org.junit.runner.RunWith;

import base.Base;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Features\\fea.feature",glue="stepdef",
                 monochrome=true,
                 plugin= {"html:target/report.html","json:target/report.json"})


public class Runner extends Base {
	

    
}