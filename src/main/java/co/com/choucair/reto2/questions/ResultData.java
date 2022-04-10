package co.com.choucair.reto2.questions;


import co.com.choucair.reto2.model.Data_result;
import co.com.choucair.reto2.userinterface.pageSimulador;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ResultData implements Question<Boolean> {

    private  final List<Data_result> DatosList;

    public ResultData(List<Data_result> DatosList) {
        this.DatosList= DatosList;
    }

    public static ResultData toThe(List<Data_result> DatosList) {
        return new ResultData(DatosList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String credito = Text.of(pageSimulador.CUOTAFIJA_PESOS).viewedBy(actor).asString();

        int numfilas = Serenity.getWebdriverManager().getCurrentDriver().findElements(
                By.xpath("//*[@id='cdk-accordion-child-0']/div/div")).size();
        int numcolum = Serenity.getWebdriverManager().getCurrentDriver().findElements(
                By.xpath("//*[@id='cdk-accordion-child-0']/div/div/small")).size() / numfilas;
        for (int i = 1; i<= numfilas; i++)
        {
            for (int j = 1; j<= numcolum; j++)
            {
                System.out.println(Serenity.getWebdriverManager().getCurrentDriver().findElement
                        (By.xpath("//*[@id='cdk-accordion-child-0']/div/div["+i+"]/small["+j+"]")).getText());
            }
        }
        result = credito.equals(DatosList.get(0).getStrButton());
        System.out.println(credito);
        return  result;
    }
}


