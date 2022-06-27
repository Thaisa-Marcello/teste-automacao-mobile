package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features",
        tags = "not @ignore",
        glue = {"steps"}
)

//metódo para iniciar os testes
public class RunCucumberTest {

    private static AppiumDriver<RemoteWebElement> driver;
    @BeforeClass
    public static void caps() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("unicodeKeyboard",true);
        driver = new AndroidDriver<RemoteWebElement>(new URL("http:localhost:4723/wd/hub"),capabilities);
    }
}