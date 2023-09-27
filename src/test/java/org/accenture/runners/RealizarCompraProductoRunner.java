package org.accenture.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = {"src/test/resources/features/RealizarCompraProducto.feature"},
        glue = {"org.accenture.hooks", "org.accenture.steps"}

)
public class RealizarCompraProductoRunner {
}
