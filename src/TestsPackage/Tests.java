package TestsPackage;

//import EnvSetupPackage.EnvSetup;
//import EnvSetupPackage.TestSetup;
import EnvSetupPackage.*;
import ValidationPackage.Validations;
import org.junit.*;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.BeforeClass;

/**
 * Created by Goutham on 7/9/2017.
 */
public abstract class Tests {
    public WebDriver d;
    public TestSetup t;
    public Validations v;

    // main method is not necessary in this case. TestNG probably invokes one
/*    public static void main(String args[]) {

    } */
        @BeforeMethod
        public void initializeBrowser() {
            d = new EnvSetup().initializeBrowser();
        }

        @BeforeMethod
        public void initiliazeTestSetup(){
            t = new EnvSetup().initializeTestsetup();
        }

        @BeforeMethod
        public void validationInitialize() {v = new Validations();}

        @BeforeClass
        public void beforeClass(){System.out.println("Before Class");}

        @AfterClass
        public void afterClass(){System.out.println("Before Class");}

        @AfterMethod
        public void closeBrowser(){
            d.quit();
        }
}
