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

    public void accederMenuPrincipal() { aviancaPages.aviancaWebPageMenuPrincipal(); }

    public void ingresarAlPortalItinerarios() { aviancaPages.aviancaItinerarios(); }

    public void buscarReservas(String origen, String destino, String fechaIda, String fechaRegreso){

    }
}
