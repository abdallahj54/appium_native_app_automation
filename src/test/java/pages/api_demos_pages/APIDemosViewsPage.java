package pages.api_demos_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class APIDemosViewsPage extends BasePage{

    public APIDemosViewsPage(){
        super();
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Animation']")
    public MobileElement animationButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Shake']")
    public MobileElement shakeButton;

    @AndroidFindBy(id = "io.appium.android.apis:id/pw")
    public MobileElement inputBox;
}
