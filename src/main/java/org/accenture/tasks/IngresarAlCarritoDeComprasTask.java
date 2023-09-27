package org.accenture.tasks;

import io.cucumber.java.sl.In;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static org.accenture.ui.HomeUi.HOME_CART;

public class IngresarAlCarritoDeComprasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HOME_CART));
    }

    public static IngresarAlCarritoDeComprasTask action(){
        return Tasks.instrumented(IngresarAlCarritoDeComprasTask.class);
    }
}
