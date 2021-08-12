package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AviancaPages {
    @FindBy(name = "pbOrigen")
    WebElement pbOrigen;

    @FindBy(name = "pbDestino")
    WebElement pbDestino;

    @FindBy(name = "pbFechaIda")
    WebElement pbFechaIda;

    @FindBy(name = "pbFechaRegreso")
    WebElement pbFechaRegreso;

    @FindBy(xpath = "//button[contains(@class,'btn-codepromo pull-btn rojo')]")
    WebElement pbTrip;

    @FindBy(xpath = "//a[contains(@data-target, '#menu-abierto')]")
    WebElement menuGlobal;

    @FindBy(xpath = "//a[contains(@href, '/co/es/tu-reserva/consulta-itinerarios/')]")
    WebElement linkItinerarios;

    @FindBy(name = "destinoIter")
    WebElement destinoIter;

    @FindBy(name = "fechaIdaIterISO")
    WebElement fechaIdaIterISO;

    @FindBy(name = "fechaRegresoIterISO")
    WebElement fechaRegresoIterISO;

    @FindBy(id = "mainContent_Ir")
    WebElement mainContent_Ir;

    private WebDriver webDriver;

    public AviancaPages(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void aviancaWebPage(){
        webDriver.get("https://www.avianca.com/co/es/");
    }

    public void aviancaWebPageMenuPrincipal() { menuGlobal.click(); }

    public void aviancaItinerarios() { linkItinerarios.click(); }

    public void ingresarOrigenDestino(String origen, String destino, String tipoAccion){
        switch (tipoAccion) {
            case "reserva" -> {
                pbOrigen.sendKeys(origen);
                pbDestino.sendKeys(destino);
            }
            case "itinerario" -> {
                pbOrigen.sendKeys(origen);
                destinoIter.sendKeys(destino);
            }
        }
    }

    public void ingresarFechas(String diaIda, String diaRegreso){ }

    public void buscarVuelos(){
        pbTrip.submit();
    }

    public void buscarHorarios(){
        mainContent_Ir.submit();
    }
}
