package co.com.choucair.reto2.tasks;

import co.com.choucair.reto2.model.DataRegisterSimulador;

import co.com.choucair.reto2.userinterface.pagePersonas;
import co.com.choucair.reto2.userinterface.pageSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class Simulador implements Task {

    private List<DataRegisterSimulador> datosForm;

    public Simulador(List<DataRegisterSimulador> datosForm) {
        this.datosForm = datosForm;
    }

    public static Simulador PageP(List<DataRegisterSimulador> dataForm) {
        return Tasks.instrumented(Simulador.class,dataForm);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(pagePersonas.BTN_CLOSE),
                WaitUntil.the(pagePersonas.MENU_PRODUCTOS_SERVICIOS, WebElementStateMatchers.isVisible()).forNoMoreThan(60).seconds(),
                Click.on(pagePersonas.MENU_PRODUCTOS_SERVICIOS),
                Click.on(pagePersonas.OPC_LEASING),
                Click.on(pagePersonas.LEASING_HABITACIONAL),
                WaitUntil.the(pagePersonas.BTN_SIMULADOR, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(60).seconds(),
                Click.on(pagePersonas.BTN_SIMULADOR),
                Click.on(pagePersonas.BTN_CALCULADOR_CUOTAS),
                Enter.theValue(datosForm.get(0).getValor_vivienda())
                        .into(pageSimulador.TXT_Valor_simulacion),
                Enter.theValue(datosForm.get(0).getValor_necesario())
                        .into(pageSimulador.TXT_MONTO_NECESARIO),
                Enter.theValue(datosForm.get(0).getAños())
                        .into(pageSimulador.TXT_AÑOS),
                Click.on(pageSimulador.TXT_FECHA_NACIMIENTO),
                Click.on(pageSimulador.BTN_CALENDAR),
                Click.on(pageSimulador.AÑO),
                Click.on(pageSimulador.MES),
                Click.on(pageSimulador.DIA),
                Click.on(pageSimulador.BTN_CALCULAR),
                WaitUntil.the(pageSimulador.CUOTAFIJA_PESOS, WebElementStateMatchers.isVisible()),
                WaitUntil.the(pageSimulador.TXT_Valor_simulacion, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(120).seconds()
        );
    }
}
