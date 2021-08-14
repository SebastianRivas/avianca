package steps;

import org.junit.Assert;
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
        aviancaPages.ingresarOrigenDestino(origen, destino, "reserva");
        aviancaPages.ingresarFechas(fechaIda, fechaRegreso,"reserva");
        aviancaPages.buscarVuelos();
    }

    public void buscarItinerario(String origen, String destino, String fechaIda, String fechaRegreso){
        aviancaPages.ingresarOrigenDestino(origen, destino, "itinerario");
        aviancaPages.ingresarFechas(fechaIda, fechaRegreso, "itinerario");
        aviancaPages.buscarHorarios();
    }

    public void verificarAccesoPortalVuelos(){
        String actualTitle = aviancaPages.getCurrentPageTitle();
        String expectedTitle = "Avianca | Disponibilidad";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void verificarAccesoPortalItinerarios(){
        String actualTitle = aviancaPages.getCurrentPageTitle();
        String expectedTitle = "Itinerario de vuelos | Avianca";

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
