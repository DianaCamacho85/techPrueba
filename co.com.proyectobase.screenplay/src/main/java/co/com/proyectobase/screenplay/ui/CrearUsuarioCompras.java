package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://tutorialsninja.com/demo/")


public class CrearUsuarioCompras extends PageObject {

    public static final Target SelectMyAcountMenu = Target.the("Seleccionar campo menu").located(By.linkText("My Account"));
    public static final Target BtnRegistrar= Target.the("Seleccionar campo registrar").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
    public static final Target Nombre = Target.the("Nombre").located(By.id("input-firstname"));
    public static final Target Apellido = Target.the("Apellido").located(By.id("input-lastname"));
    public static final Target Email = Target.the("Email").located(By.id("input-email"));
    public static final Target Telefono = Target.the("Telefono").located(By.id("input-telephone"));
    public static final Target Password = Target.the("Pasword").located(By.id("input-password"));
    public static final Target ConfPass = Target.the("ConfPass").located(By.id("input-confirm"));
    public static final Target Suscribirse = Target.the("Suscribirse").located(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input"));
    public static final Target PolPrivacidad = Target.the("Politica").located(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
    public static final Target btnContinuar = Target.the("BtnContinuar").located(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
    public static final Target btnContinuarPag2 = Target.the("BtnContinuarPag2").located(By.xpath("//*[@id=\"content\"]/div/div/a"));
    public static final Target Msj_Validacion = Target.the("MensajeValidacion").located(By.linkText("My Orders"));
}






