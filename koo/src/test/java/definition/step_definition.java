package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_definition {
	
	public static String url="https://www.kooapp.com/feed";
	WebDriver driver;
	
	@When("click on plus koo")
		public void click_on_the_pluskoo() {
			driver.findElement(By.xpath("//*[@class='_2VfDv']")).click();
	}
	
	@Then("i should see the features inside plus koo")
	public void i_should_see_the_features()throws InterruptedException {
	    Thread.sleep(2000);
	    driver.quit();
	

}
}