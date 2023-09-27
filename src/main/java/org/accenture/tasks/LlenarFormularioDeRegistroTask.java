package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.accenture.ui.SignUpFormUi;

public class LlenarFormularioDeRegistroTask implements Task {

    private String userName;
    private String password;

    public LlenarFormularioDeRegistroTask(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userName).into(SignUpFormUi.SIGNUP_USERNAME));
        actor.attemptsTo(Enter.theValue(userName).into(SignUpFormUi.SIGNUP_PASSWORD));
    }

    public static LlenarFormularioDeRegistroTask data(String userName, String password){
        return Tasks.instrumented(LlenarFormularioDeRegistroTask.class, userName, password);
    }

}
