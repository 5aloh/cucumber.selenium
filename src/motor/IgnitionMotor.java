package motor;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
//Glue code for feature files 
@RunWith(Cucumber.class)
@Cucumber.Options(features="features",glue={"pasos"})
public class IgnitionMotor {
	
	

}
