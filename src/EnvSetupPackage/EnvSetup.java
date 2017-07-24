package EnvSetupPackage;

import org.openqa.selenium.WebDriver;

/**
 * Created by Goutham on 7/9/2017.
 */
public class EnvSetup {
    public WebDriver d;
    public TestSetup t;

    public WebDriver initializeBrowser(){
        return BrowserSetup.createDriver();
    }

    public TestSetup initializeTestsetup(){
        return new TestSetup();
    }
}
