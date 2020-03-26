package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.ui.CrearUsuarioCompras;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCreacionUsuarioExitosa implements Question {

    @Override
    public String answeredBy(Actor actor) {

    String mensaje = Text.of(CrearUsuarioCompras.Msj_Validacion).viewedBy(actor).asString();
            return mensaje;
}
    }
