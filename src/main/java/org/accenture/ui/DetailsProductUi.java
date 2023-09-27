package org.accenture.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetailsProductUi extends PageObject {
    public static Target DETAILSPRODUCT_BUTTON=
            Target.the("").locatedBy("//*[text()='Add to cart']");
}
