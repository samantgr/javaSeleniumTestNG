package EnvSetupPackage;

/**
 * Created by Goutham on 7/9/2017.
 */
public class TestSetup {
    public String url(String urlType){
        String url = null;
        switch (urlType){ //Switch is fall through. without break; all statements will be executed
            case "pForm" :
                url =  "http://toolsqa.com/automation-practice-form/";
            case "oStore" :
                url =  "http://Store.DemoQA.com/";
            case "demoQa" :
                url =  "http://demoqa.com/frames-and-windows/";
        }
        return url;
    }
}
