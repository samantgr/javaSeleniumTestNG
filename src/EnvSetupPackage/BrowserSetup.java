package EnvSetupPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Goutham on 7/8/2017.
 */
public class BrowserSetup {
    public static WebDriver createDriver() {
        WebDriver browser = new FirefoxDriver();
        return browser;
        // return new FirefoxDriver(); Equivalent to above two statements
    }
}
