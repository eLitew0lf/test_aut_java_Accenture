package org.accenture.steps;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.util.EnvironmentVariables;
import org.accenture.questions.ConfirmarMensajeExitosoQuestion;
import org.accenture.tasks.*;


public class RegistrarUsuarioStep {


    @Cuando("el usuario hace clic en el apartado Sign up")
    public void el_usuario_hace_clic_en_el_apartado_sign_up() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPestañaDeRegistroTask.action());
    }
    @Cuando("el usuario ingresa el nombre de usuario {string} y la contraseña {string}")
    public void el_usuario_ingresa_el_nombre_de_usuario_y_la_contraseña(String user, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormularioDeRegistroTask.data(user, password));
    }
    @Cuando("el usuario hace clic en el botón Sign up")
    public void el_usuario_hace_clic_en_el_botón_sign_up() {
        OnStage.theActorInTheSpotlight().attemptsTo(PresionaElBotonDeRegistroTask.action());
    }
    @Entonces("el usuario confirma el alert de registro exitoso")
    public void el_usuario_confirma_el_alert_de_registro_exitoso() {
        OnStage.theActorInTheSpotlight().attemptsTo(AcceptAlertTask.accept());
    }

}
