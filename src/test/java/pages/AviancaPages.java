package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AviancaPages {
    @FindBy(xpath = "//input[contains(@class,'airport pbOrigen airport_ida airport_mvvn valid')]")
    WebElement pbOrigen;

    @FindBy(xpath = "//input[contains(@class,'airport pbDestino airport_regreso airport_mvvn error')]")
    WebElement pbDestino;

    @FindBy(name = "pbFechaIda")
    WebElement pbFechaIda;

    @FindBy(name = "pbFechaRegreso")
    WebElement pbFechaRegreso;

    @FindBy(name = "pbPasajeros")
    WebElement pbPasajeros;

    @FindBy(xpath = "//button[contains(@class,'btn-codepromo pull-btn rojo')]")
    WebElement pbTrip;

    private WebDriver webDriver;

    public AviancaPages(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void aviancaWebPage(){
        webDriver.get("https://www.avianca.com/co/es/");
    }

    public void ingresarOrigenDestino(String origen, String destino){
        pbOrigen.sendKeys(origen);
        pbDestino.sendKeys(destino);
    }

    public void ingresarFechas(int diaIda, int diaRegreso){
    }

    public void ingresarPasajeros(int numeroPasajeros){
    }

    public void buscarVuelos(){
        pbTrip.click();
    }
}
