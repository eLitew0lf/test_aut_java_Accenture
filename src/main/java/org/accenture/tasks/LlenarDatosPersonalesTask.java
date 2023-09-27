package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.accenture.models.PersonaModel;

import static org.accenture.ui.CartInfoUi.*;

public class LlenarDatosPersonalesTask implements Task {

    private PersonaModel dataForForm;

    public LlenarDatosPersonalesTask(PersonaModel dataForForm) {
        this.dataForForm = dataForForm;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EsperarTask.milliseconds(1000));
        actor.attemptsTo(Enter.theValue(dataForForm.getNombre()).into(CART_MODAL_NAME));
        actor.attemptsTo(Enter.theValue(dataForForm.getDepartamento()).into(CART_MODAL_COUNTRY));
        actor.attemptsTo(Enter.theValue(dataForForm.getCiudad()).into(CART_MODAL_CITY));
        actor.attemptsTo(Enter.theValue(dataForForm.getTarjetaCredito()).into(CART_MODAL_CARD));
        actor.attemptsTo(Enter.theValue(dataForForm.getMes()).into(CART_MODAL_MONTH));
        actor.attemptsTo(Enter.theValue(dataForForm.getAnio()).into(CART_MODAL_YEAR));
        actor.attemptsTo(Click.on(CART_MODAL_BUTTON));
    }

    public static LlenarDatosPersonalesTask data(PersonaModel dataForForm){
        return Tasks.instrumented(LlenarDatosPersonalesTask.class, dataForForm);
    }

}
