package co.com.proyectobase.screenplay.interactions;


import co.com.proyectobase.screenplay.ui.LoguearUsuario;
import co.com.proyectobase.screenplay.ui.SelecionarProducto;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;



public class AgregarProducto implements Interaction {

    private List<List<String>> data;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(LoguearUsuario.SelectMyAcountMenu));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnLogin));
        actor.attemptsTo(Enter.theValue(data.get(1).get(0).trim()).into(LoguearUsuario.EmailLogin));
        actor.attemptsTo(Enter.theValue(data.get(1).get(1).trim()).into(LoguearUsuario.PassLogin));
        actor.attemptsTo(Click.on(LoguearUsuario.BtnContinuarLogin));
        actor.attemptsTo(Click.on(SelecionarProducto.OpcionPhonePda));
        clic_listaProductos(SelecionarProducto.listaProductos.resolveFor(actor), data.get(1).get(2).trim());
    }
    public static AgregarProducto AgregarProducto(List<List<String>> data) {
        return Tasks.instrumented(AgregarProducto.class, data);
    }
    public AgregarProducto(List<List<String>> data) {
        this.data = data;
    }
    public void clic_listaProductos(WebElementFacade objeto, String strDato) {
        List<WebElement> listElementos = objeto.findElements(By.tagName("div"));
        for (WebElement e : listElementos) {
            if (e.getText().contains(strDato)) {
                e.click();
                break;
            }
        }
    }


}

