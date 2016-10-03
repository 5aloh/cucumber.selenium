package pasos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EjecucionPasos {
	
	
	WebDriver driver;
	
	@Given("^Open Chrome and start application$")
	public void Open_Chrome_and_start_application() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\cesarh\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	
	
	
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_and(String fname, String lname, String email, String reemail, String pass) throws Throwable {
		
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(reemail);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
		
		
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		
	   
	}

}
