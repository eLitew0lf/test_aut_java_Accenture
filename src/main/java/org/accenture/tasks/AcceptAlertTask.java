package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptAlertTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alert.accept();
    }

    public static AcceptAlertTask accept() {
        return instrumented(AcceptAlertTask.class);
    }

}
