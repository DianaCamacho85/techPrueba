package co.com.proyectobase.screenplay.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelecionarProducto extends PageObject {

    public static final Target OpcionPhonePda = Target.the("PhonePDA").located(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
    public static final Target listaProductos = Target.the ("lista de productos").located(By.xpath("//*[@id=\"content\"]"));
}
