package org.accenture.steps.hooks;

import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class hook {

    @Before
    public void inicio(){
        setTheStage(new OnlineCast());
        theActorCalled("Usuario AUT");
    }

    @After
    public void fin(){
        ThucydidesWebDriverSupport.getDriver().quit();
    }

}
