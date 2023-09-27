package org.accenture.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EsperarTask implements Task {

    int time;

    public EsperarTask(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (Exception ie) {
            ie.printStackTrace();
        }
    }

    public static EsperarTask milliseconds(int time) {
        return instrumented(EsperarTask.class, time);
    }
}
