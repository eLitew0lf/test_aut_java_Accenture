package org.accenture.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpFormUi extends PageObject {

    public static Target SIGNUP_USERNAME=
            Target.the("").located(By.id("sign-username"));
    public static Target SIGNUP_PASSWORD=
            Target.the("").located(By.id("sign-password"));

    public static Target SIGNUP_BUTTON=
            Target.the("").locatedBy("(//*[text()='Sign up'])[2]");

}
