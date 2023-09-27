package org.accenture.steps.common;

import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.util.EnvironmentVariables;

public class CommonSteps {
    private EnvironmentVariables environmentVariables;

    @Dado("que el usuario abre la página Product Store")
    public void que_el_usuario_abre_la_página_product_store() {
        String url = environmentVariables.getProperty("environments.default.url");
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url(url));
    }
}
