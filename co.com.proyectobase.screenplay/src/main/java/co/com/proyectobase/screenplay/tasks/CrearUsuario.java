package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.CrearUsuarioCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class CrearUsuario implements Task {

    private List<List<String>> data;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CrearUsuarioCompras.SelectMyAcountMenu));
        actor.attemptsTo(Click.on(CrearUsuarioCompras.BtnRegistrar));
        actor.attemptsTo(Enter.theValue(data.get(1).get(0).trim()).into(CrearUsuarioCompras.Nombre));
        actor.attemptsTo(Enter.theValue(data.get(1).get(1).trim()).into(CrearUsuarioCompras.Apellido));
        actor.attemptsTo(Enter.theValue(data.get(1).get(2).trim()).into(CrearUsuarioCompras.Email));
        actor.attemptsTo(Enter.theValue(data.get(1).get(3).trim()).into(CrearUsuarioCompras.Telefono));
        actor.attemptsTo(Enter.theValue(data.get(1).get(4).trim()).into(CrearUsuarioCompras.Password));
        actor.attemptsTo(Enter.theValue(data.get(1).get(5).trim()).into(CrearUsuarioCompras.ConfPass));
        actor.attemptsTo(Click.on(CrearUsuarioCompras.Suscribirse));
        actor.attemptsTo(Click.on(CrearUsuarioCompras.PolPrivacidad));
        actor.attemptsTo(Click.on(CrearUsuarioCompras.btnContinuar));
        actor.attemptsTo(Click.on(CrearUsuarioCompras.btnContinuarPag2));
    }

    public static CrearUsuario RegistroUsuario(List<List<String>> data) {
        return Tasks.instrumented(CrearUsuario.class, data);
    }

    public CrearUsuario(List<List<String>> data) {
        this.data = data;
    }

}