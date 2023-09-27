package org.accenture.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.accenture.tasks.GetAlertTextTask;

public class ConfirmarMensajeExitosoQuestion implements Question<String> {

    private GetAlertTextTask getAlertTextTask;

    public ConfirmarMensajeExitosoQuestion(GetAlertTextTask getAlertTextTask) {
        this.getAlertTextTask = getAlertTextTask;
    }

    @Override
    public String answeredBy(Actor actor) {
        return getAlertTextTask.getAlertText();
    }

    public static ConfirmarMensajeExitosoQuestion capturedBy(GetAlertTextTask getAlertTextTask){
        return new ConfirmarMensajeExitosoQuestion(getAlertTextTask);
    }

}
