package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("http://tutorialsninja.com/demo/")

public class LoguearUsuario extends PageObject {

    public static final Target SelectMyAcountMenu = Target.the("Seleccionar campo menu").located(By.linkText("My Account"));
    public static final Target BtnLogin= Target.the("Seleccionar campo Loguear").located(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
    public static final Target EmailLogin = Target.the("EmailLogin").located(By.name("email"));
    public static final Target PassLogin = Target.the("PassLogin").located(By.id("input-password"));
    public static final Target BtnContinuarLogin = Target.the("BtnContinuarLogin").located(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));




}
