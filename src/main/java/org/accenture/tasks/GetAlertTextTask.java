package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

import javax.swing.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetAlertTextTask implements Task {

    public static String alertText;

    public GetAlertTextTask(String alertText) {
        GetAlertTextTask.alertText = alertText;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alertText = alert.getText();

        alert.accept();
    }

    public static GetAlertTextTask andCaptureTheText() {
        return instrumented(GetAlertTextTask.class);
    }

    public String getAlertText() {
        return alertText;
    }

}
