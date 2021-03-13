import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Akif Rahman\\eclipse-workspace\\BDDProject\\login.feature"} 
 ,tags= {"@smoke"} , plugin= {"pretty:report/index.html"})

public class Runner {

}
