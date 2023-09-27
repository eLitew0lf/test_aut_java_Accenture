package org.accenture.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SweetAlertUI extends PageObject {

    public static Target SWEETALERT_MENSAJE=
            Target.the("").locatedBy("/html/body/div[10]/h2");

}
