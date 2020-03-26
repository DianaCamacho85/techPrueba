package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.ui.CrearUsuarioCompras;
import co.com.proyectobase.screenplay.ui.LoguearUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Task {

    private CrearUsuarioCompras crearUsuarioCompras;
    private LoguearUsuario loguearUsuario;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(crearUsuarioCompras));
        actor.attemptsTo(Open.browserOn(loguearUsuario));
    }
    public static AbrirNavegador webTutorialNinja() {
        return Tasks.instrumented(AbrirNavegador.class);

    }

}




