package TestsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Goutham on 7/9/2017.
 */
public class NavigationCommands extends Tests {
    @Test
    public void exerciseOne(){
        String actualUrl = t.url("oStore");
        d.navigate().to(actualUrl);
        WebElement link = d.findElement(By.xpath(".//*[@id=\"menu-item-374\"]/a"));
        link.click();
        String pageUrl = d.getCurrentUrl();
        if(v.compareUrls(actualUrl, pageUrl)){
            System.out.println("Correct Page");
        }else{
            System.out.println("In correct Page");
        }
        d.navigate().back();
        d.navigate().forward();
        if(v.compareUrls(actualUrl, d.getCurrentUrl())){
            System.out.println("Correct Page");
        }else{
            System.out.println("Incorrect Page");
        }
        d.navigate().to(actualUrl);
        if(v.compareUrls(actualUrl, pageUrl)){
            System.out.println("Correct Page");
        }else{
            System.out.println("In correct Page");
        }
        d.navigate().refresh();
    }
}

