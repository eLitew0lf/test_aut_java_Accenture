package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.accenture.ui.CartInfoUi;

import static org.accenture.ui.HomeUi.HOME_CART;

public class PresionarElBotonDeCompraTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EsperarTask.milliseconds(1000));
        actor.attemptsTo(Click.on(CartInfoUi.CART_BUTTON));
    }

    public static PresionarElBotonDeCompraTask action(){
        return Tasks.instrumented(PresionarElBotonDeCompraTask.class);
    }
}
