package Steps.Mobiles;

import configurations.Driver.DriverManager;
import configurations.Util.GenericUtil;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageAndScreens.mobiles.SauceLabsLoginScreen;

import java.io.IOException;

public class AppiumTest {

    SauceLabsLoginScreen sauceLabsLoginScreen = new SauceLabsLoginScreen((AppiumDriver) DriverManager.driverInstance().getDriver("mobile"));

    public AppiumTest() throws IOException {}

    @Given("Launch the APP")
    public void launch_the_app() throws Exception {
        GenericUtil.genericUtilInstance().getLog().info("Launching the mobile Application");
        sauceLabsLoginScreen.getProductSelect("android");
    }
    @When("Successfully launched")
    public void successfully_launched() throws IOException {
        GenericUtil.genericUtilInstance().getLog().info("Launched the mobile Application");
        sauceLabsLoginScreen.getAddToCart("android");
    }
    @Then("Verify launched and get the home page")
    public void verify_launched_and_verify_the_home_page() throws IOException {
        GenericUtil.genericUtilInstance().getLog().info("Launching the mobile Application and verified");
        sauceLabsLoginScreen.getClickOnCart("android");
    }
}
