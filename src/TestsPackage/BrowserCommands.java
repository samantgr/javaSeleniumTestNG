package TestsPackage;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

/**
 * Created by Goutham on 7/8/2017.
 */
public class BrowserCommands extends Tests {
    @Test
    public void exerciseOne(){
        String actualUrl = t.url("oStore");
        d.get(actualUrl);
        String pageTitle = d.getTitle(); //get page title
        int pageLength = pageTitle.length(); //get title length
        //print page title and title length on console
        System.out.println("Page Title is: " + pageTitle + " and Page Length is: " + pageLength);
        String pageUrl = d.getCurrentUrl(); //get page url
        if(v.compareUrls(actualUrl, pageUrl)) {
            System.out.println("Page url is correct");
        }else{
            System.out.println("Page url is not correct");
        }
        System.out.println("Expected: " + actualUrl);
        System.out.println("Actual: " + pageUrl);
        String pageSource = d.getPageSource(); //get page source
        int pageSourceLength = pageSource.length(); //get page source length
        System.out.println("Page Source length is: " + pageSourceLength);
    }

    @Test
    public void exerciseTwo(){
        String actualUrl = t.url("demoQa");
        d.get(actualUrl);
        WebElement button = d.findElement(By.xpath("//*[@id=\"tabs-1\"]/div/p/a"));
        button.click();
        if(v.compareNumberOfWindows(2, d.getWindowHandles().size())){
            System.out.println("Correct Number of Wimdows Open");
        }else {
            System.out.println("Incorrect Number of Windows open");
        }
    }

}
