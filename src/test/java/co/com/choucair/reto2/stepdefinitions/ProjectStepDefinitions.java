package co.com.choucair.reto2.stepdefinitions;


import co.com.choucair.reto2.model.DataRegisterSimulador;
import co.com.choucair.reto2.tasks.OpenUp;
import co.com.choucair.reto2.tasks.Simulador;
import co.com.choucair.reto2.tasks.Simulador2;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import javax.xml.crypto.Data;
import java.util.List;

public class ProjectStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Sergio ingresa a la pagina de Bancolombia en la seccion$")
    public void SergioIngresaALaPaginaDeBancolombia() throws Exception {
        OnStage.theActorCalled("Sergio").wasAbleTo(OpenUp.thePage());
    }

    @When("^Cargar datos para simulacion ingresamos el \"([^\"]*)\" , monto necesario \"([^\"]*)\" y los años \"([^\"]*)\"$")
    public void CargarDatosParaSimulacion(String arg1, String arg2, String arg3) throws Exception {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
        OnStage.theActorInTheSpotlight().wasAbleTo(Simulador2.PageP(arg1,arg2,arg3));
        //OnStage.theActorInTheSpotlight().wasAbleTo(Simulador.PageP(datosLeasing));
    }

    /*@Then("^Validar costos fijos$")
    public void validarCostosFijos(List<Dat>) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().wasAbleTo(Simulador.PageP());
    }*/

    @Given("^Sergio ingresa a la pagina de Bancolombia en la seccion de leasing$")
    public void sergioIngresaALaPaginaDeBancolombiaEnLaSeccionDeLeasing() throws Exception {
        OnStage.theActorCalled("Sergio").wasAbleTo(OpenUp.thePage());
    }

    @When("^Cargar datos para simulacion$")
    public void cargarDatosParaSimulacion(List<DataRegisterSimulador> datosLeasing) throws Exception {
        OnStage.theActorInTheSpotlight().wasAbleTo(Simulador.PageP(datosLeasing));
    }

    /*@Then("^Validar costos fijos$")
    public void validarCostosFijos() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/















}
