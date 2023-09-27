package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.accenture.ui.SignUpFormUi;

import static org.accenture.ui.HomeUi.HOME_SIGNUP;

public class PresionaElBotonDeRegistroTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SignUpFormUi.SIGNUP_BUTTON));
        actor.attemptsTo(EsperarTask.milliseconds(1000));
    }

    public static PresionaElBotonDeRegistroTask action(){
        return Tasks.instrumented(PresionaElBotonDeRegistroTask.class);
    }

}
