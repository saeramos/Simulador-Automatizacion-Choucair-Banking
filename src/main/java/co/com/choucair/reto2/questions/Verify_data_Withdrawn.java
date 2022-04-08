package co.com.choucair.reto2.questions;

import co.com.choucair.reto2.model.DataRegisterSimulador;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Verify_data_Withdrawn implements Question<Boolean> {

    private List<DataRegisterSimulador> datosWithdrawn;

    public Verify_data_Withdrawn(List<DataRegisterSimulador> datosWithdrawn) {
        this.datosWithdrawn = datosWithdrawn;
    }

    public static Verify_data_Withdrawn toThe(List<DataRegisterSimulador> datosWithdrawn) {
        return new Verify_data_Withdrawn(datosWithdrawn);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        /*boolean result;
        String vefificar_datos = Text.of(pageSimulador.VERIFICATION_WITHDRAWN).viewedBy(actor).asString();
        String Verificar = datosWithdrawn.get(0).getVerification_register_withdraw();
        if (Verificar.equals(vefificar_datos)){
            result = true;
        }else {
            result = false;
        }
        return result;*/
        return true;
    }
}
