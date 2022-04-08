package co.com.choucair.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class pagePersonas extends PageObject {

    public static final Target MENU_PRODUCTOS_SERVICIOS = Target.the("Seleccionar productos y servicios")
            .located(By.id("menu-productos"));
    public static final Target BTN_CLOSE = Target.the("Cerrar modal")
            .located(By.className("modal-prehome-fenix-header-info-button-home"));
    public static final Target OPC_LEASING = Target.the("Seleccionar leasing en el menú")
            .located(By.id("header-productos-leasing"));
    public static final Target LEASING_HABITACIONAL = Target.the("Seleccionar leasing habitacional")
            .located(By.xpath("//*[@id='category-detail']/div/div/div[2]/div/div[2]/h2/a"));
    public static final Target BTN_SIMULADOR = Target.the("Seleccionar el simulador")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[5]/section/div[3]/section/div/div/div[1]/div[6]/a"));
    public static final Target BTN_CALCULADOR_CUOTAS = Target.the("Seleccionar calculadora de cuotas")
            .located(By.id("calcular-cuotas"));




}
