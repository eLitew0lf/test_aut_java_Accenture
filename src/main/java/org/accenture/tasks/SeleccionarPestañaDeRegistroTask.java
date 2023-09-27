package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.accenture.ui.HomeUi.HOME_SIGNUP;

public class SeleccionarPestañaDeRegistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HOME_SIGNUP));
    }

    public static SeleccionarPestañaDeRegistroTask action(){
        return Tasks.instrumented(SeleccionarPestañaDeRegistroTask.class);
    }

}
