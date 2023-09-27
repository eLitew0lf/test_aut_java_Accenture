package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.accenture.ui.DetailsProductUi;

import static org.accenture.ui.DetailsProductUi.DETAILSPRODUCT_BUTTON;
import static org.accenture.ui.HomeUi.*;

public class SeleccionarProductoYAgregarAlCarritoTask implements Task {

    public String categoria;
    public String producto;

    public SeleccionarProductoYAgregarAlCarritoTask(String categoria, String producto) {
        this.categoria = categoria;
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HOME_CATEGORY.of(categoria)));
//        actor.attemptsTo(Scroll.to(HOME_PRODUCT_NAME.of(producto)));
        actor.attemptsTo(Click.on(HOME_PRODUCT_NAME.of(producto)));
        actor.attemptsTo(EsperarTask.milliseconds(1000));
        actor.attemptsTo(Click.on(DETAILSPRODUCT_BUTTON));
        actor.attemptsTo(EsperarTask.milliseconds(1300));
        actor.attemptsTo(AcceptAlertTask.accept());
        actor.attemptsTo(Click.on(HOME_HOME));

    }

    public static SeleccionarProductoYAgregarAlCarritoTask data(String categoria, String producto){
        return Tasks.instrumented(SeleccionarProductoYAgregarAlCarritoTask.class, categoria, producto);
    }
}
