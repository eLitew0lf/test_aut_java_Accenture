package org.accenture.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.accenture.ui.SweetAlertUI.SWEETALERT_MENSAJE;

public class ConfirmarMensajeDeCompraExitosaQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return SWEETALERT_MENSAJE.resolveFor(actor).getText();
    }

    public static Question <String> capturedBySweetAlert(){
        return new ConfirmarMensajeDeCompraExitosaQuestion();
    }

}
