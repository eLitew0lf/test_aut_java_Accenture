package org.accenture.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.accenture.models.PersonaModel;
import org.accenture.questions.ConfirmarMensajeDeCompraExitosaQuestion;
import org.accenture.tasks.IngresarAlCarritoDeComprasTask;
import org.accenture.tasks.LlenarDatosPersonalesTask;
import org.accenture.tasks.PresionarElBotonDeCompraTask;
import org.accenture.tasks.SeleccionarProductoYAgregarAlCarritoTask;

import java.util.List;
import java.util.Map;

public class RealizarCompraProductosStep {

    @Cuando("el usuario agrega los siguientes productos al carrito:")
    public void el_usuario_agrega_los_siguientes_productos_al_carrito(List<Map<String, String>> dataTable) {
        for (Map<String, String> row : dataTable) {
            String categoria = row.get("Categoria");
            String producto = row.get("Producto");
            OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProductoYAgregarAlCarritoTask.data(categoria, producto));
        }
    }
    @Cuando("el usuario selecciona la opción Cart")
    public void el_usuario_selecciona_la_opción_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarAlCarritoDeComprasTask.action());
    }
    @Cuando("el usuario hace clic en el botón Place Order")
    public void el_usuario_hace_clic_en_el_botón_place_order() {
        OnStage.theActorInTheSpotlight().attemptsTo(PresionarElBotonDeCompraTask.action());
    }
    @Cuando("el usuario realiza la compra llenando el formulario con los siguientes datos:")
    public void el_usuario_realiza_la_compra_llenando_el_formulario_con_los_siguientes_datos(DataTable dataTable) {
        List<Map<String,String>> lista = dataTable.asMaps(String.class, String.class);
        Map<String,String> formData = lista.get(0);

        PersonaModel persona = new PersonaModel(formData.get("Nombre"),
                formData.get("Departamento"),
                formData.get("Ciudad"),
                formData.get("TarjetaCredito"),
                formData.get("Mes"),
                formData.get("Anio")
                );
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarDatosPersonalesTask.data(persona));
    }
    @Entonces("el usuario confirma el mensaje {string} de compra exitosa")
    public void el_usuario_confirma_el_mensaje_de_compra_exitosa(String mensajeExitoso) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(ConfirmarMensajeDeCompraExitosaQuestion.capturedBySweetAlert()).isEqualTo(mensajeExitoso));
    }

}
