package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "C:\\Users\\DELL\\eclipse-workspace\\project\\src\\test\\resources\\features\\parameter.feature",
   //path of step definition file
   glue = "stepdefination"
   )
public class Runner {

}
