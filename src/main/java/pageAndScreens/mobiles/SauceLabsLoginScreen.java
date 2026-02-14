package pageAndScreens.mobiles;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindByChainSet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLabsLoginScreen {

    public SauceLabsLoginScreen(AppiumDriver appiumDriver){
        PageFactory.initElements(appiumDriver, this);
    }

    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc='store item'])[1]/android.view.ViewGroup[1]/android.widget.ImageView")
    private WebElement productSelect_Android;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name='test-Username']")
    private WebElement iosProductSelect_iOS;

    public WebElement getProductSelect(String platformName) {
        return switch (platformName.toLowerCase()) {
            case "android" -> productSelect_Android;
            case "ios" -> iosProductSelect_iOS;
            default -> throw new IllegalArgumentException("Unsupported platform: " + platformName);
        };
    }

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Add To Cart button']")
    private WebElement addToCart_Android;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name='test-Username']")
    private WebElement addToCart_iOS;

    public WebElement getAddToCart(String platformName) {
        return switch (platformName.toLowerCase()) {
            case "android" -> addToCart_Android;
            case "ios" -> addToCart_iOS;
            default -> throw new IllegalArgumentException("Unsupported platform: " + platformName);
        };
    }

    @FindBy(xpath = "(//android.widget.TextView[@text='1'])[1]")
    private WebElement clickOnCart_Android;

    @FindBy(xpath = "//XCUIElementTypeTextField[@name='test-Username']")
    private WebElement clickOnCart_iOS;

    public WebElement getClickOnCart(String platformName) {
        return switch (platformName.toLowerCase()) {
            case "android" -> clickOnCart_Android;
            case "ios" -> clickOnCart_iOS;
            default -> throw new IllegalArgumentException("Unsupported platform: " + platformName);
        };
    }
}
