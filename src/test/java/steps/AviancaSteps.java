package steps;

import org.openqa.selenium.WebDriver;
import pages.AviancaPages;

public class AviancaSteps {
    private WebDriver webDriver = null;
    AviancaPages aviancaPages;

    public AviancaSteps(WebDriver webDriver){
        aviancaPages = new AviancaPages(webDriver);
    }

    public void ingresarAlPortalWeb(){
        aviancaPages.aviancaWebPage();
    }

    public void ingresarOrigenDestino(String origen, String destino){
        aviancaPages.ingresarOrigenDestino(origen, destino);
    }
}
