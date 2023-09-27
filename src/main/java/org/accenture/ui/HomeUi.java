package org.accenture.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUi extends PageObject {
    public static Target HOME_SIGNUP=
            Target.the("").located(By.id("signin2"));

    public static Target HOME_HOME=
            Target.the("").locatedBy("//*[contains(normalize-space(text()), 'Home')]");

    public static Target HOME_CART=
            Target.the("").locatedBy("//*[contains(normalize-space(text()), 'Cart')]");

    public static Target HOME_CATEGORY=
            Target.the("").locatedBy("//*[text()='{0}']");

    public static Target HOME_PRODUCT_NAME=
            Target.the("").locatedBy("//*[contains(normalize-space(text()), '{0}')]");

}
