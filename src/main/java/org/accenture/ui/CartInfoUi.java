package org.accenture.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartInfoUi extends PageObject {
    public static Target CART_BUTTON=
            Target.the("").locatedBy("//*[text()='Place Order']");
    public static Target CART_MODAL_NAME=
            Target.the("").located(By.id("name"));

    public static Target CART_MODAL_COUNTRY=
            Target.the("").located(By.id("country"));

    public static Target CART_MODAL_CITY=
            Target.the("").located(By.id("city"));

    public static Target CART_MODAL_CARD=
            Target.the("").located(By.id("card"));

    public static Target CART_MODAL_MONTH=
            Target.the("").located(By.id("month"));
    public static Target CART_MODAL_YEAR=
            Target.the("").located(By.id("year"));

    public static Target CART_MODAL_BUTTON=
            Target.the("").locatedBy("//*[text()='Purchase']");

}
