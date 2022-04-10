package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class pageSimulador extends PageObject {

    public static final Target TXT_Valor_simulacion = Target.the("Ingresar monto simulación")
            .located(By.id("valor-simulacion"));
    public static final Target TXT_MONTO_NECESARIO = Target.the("Ingresar monto necesario")
            .located(By.id("mat-input-4"));
    public static final Target TXT_AÑOS = Target.the("Ingresar numero de años en el simulador")
            .located(By.id("valor-year"));
    public static final Target TXT_FECHA_NACIMIENTO = Target.the("Ingresar Fecha en el simulador")
            .located(By.id("campo-fecha"));

    public static final Target BTN_CALENDAR = Target.the("Buscar en el calendario")
            .located(By.xpath("//*[@id='mat-datepicker-0']/mat-calendar-header/div/div/button[2]"));

    public static final Target AÑO = Target.the("Año")
            .located(By.xpath("//*[@id='mat-datepicker-0']/div/mat-multi-year-view/table/tbody/tr[6]/td[4]/div"));
    public static final Target MES = Target.the("Mes")
            .located(By.xpath("//*[@id='mat-datepicker-0']/div/mat-year-view/table/tbody/tr[3]/td[2]/div"));

    public static final Target DIA = Target.the("Dia")
            .located(By.xpath("//*[@id='mat-datepicker-0']/div/mat-month-view/table/tbody/tr[2]/td[1]/div"));

    public static final Target BTN_CALCULAR = Target.the("BTN")
            .located(By.id("boton-simular"));

    public static final Target CUOTAFIJA_PESOS = Target.the("Respuesta")
            .located(By.xpath("//*[@id='credit-on-pesos-button']//*[contains(text(),'Crédito de Vivienda')]"));
            //.located(By.id("boton-FIXEDFEECOP"));

}
