package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.userinterface.UtestUrl;
import co.com.choucair.reto2.userinterface.pagePersonas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class OpenUp implements Task {

    private UtestUrl utestUrl;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestUrl)
                );
    }
}
