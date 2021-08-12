package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AviancaPages {
    @FindBy(xpath = "//input[contains(@id, 'pbOrigen')]")
    WebElement pbOrigen;

    @FindBy(xpath = "//input[contains(@id, 'pbDestino')]")
    WebElement pbDestino;

    @FindBy(name = "pbFechaIda")
    WebElement pbFechaIda;

    @FindBy(name = "pbFechaRegreso")
    WebElement pbFechaRegreso;

    @FindBy(xpath = "//button[contains(@class,'btn-codepromo pull-btn rojo')]")
    WebElement pbTrip;

    @FindBy(xpath = "//a[contains(@data-target, '#menu-abierto')]")
    WebElement menuGlobal;

    @FindBy(xpath = "//*[@id=\"menu-abierto\"]/div/div/div[2]/div/div[4]/div/div/div[3]/div/ul/li[1]/a")
    WebElement linkItinerarios;

    @FindBy(id = "origenIter")
    WebElement origenIter;

    @FindBy(id = "destinoIter")
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
                origenIter.sendKeys(origen);
                destinoIter.sendKeys(destino);
            }
        }
    }

    public void ingresarFechas(String diaIda, String diaRegreso, String tipoAccion){
        switch (tipoAccion) {
            case "reserva" -> {
                pbFechaIda.sendKeys(diaIda);
                pbFechaRegreso.sendKeys(diaRegreso);
            }
            case "itinerario" -> {
                fechaIdaIterISO.sendKeys(diaIda);
                fechaRegresoIterISO.sendKeys(diaRegreso);
            }
        }
    }

    public void buscarVuelos(){ pbTrip.submit(); }

    public void buscarHorarios(){ mainContent_Ir.submit(); }
}
