package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AviancaPages {
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[1]/div/div[1]/label/div/input[1]")
    WebElement pbOrigen;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[1]/fieldset/div/div[2]/div[2]/div[1]/label/div/input[1]")
    WebElement pbDestino;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[1]/label/div/div/input")
    WebElement pbFechaIda;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[2]/label/div/div/input")
    WebElement pbFechaRegreso;

    @FindBy(xpath = "//button[contains(@class,'btn-codepromo pull-btn rojo')]")
    WebElement pbTrip;

    @FindBy(xpath = "//a[contains(@data-target, '#menu-abierto')]")
    WebElement menuGlobal;

    @FindBy(id = "origenIter")
    WebElement origenIter;

    @FindBy(id = "destinoIter")
    WebElement destinoIter;

    @FindBy(name = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[3]/div[1]/div[1]/label/div/input[1]")
    WebElement fechaIdaIterISO;

    @FindBy(name = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/label/div/input[1]")
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

    public void aviancaItinerarios() {
        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-abierto\"]/div/div/div[2]/div/div[4]/div/div/div[3]/div/ul/li[1]/a"))).click();
    }

    public void ingresarOrigenDestino(String origen, String destino, String tipoAccion){
        switch (tipoAccion) {
            case "reserva" -> {
                pbOrigen.sendKeys(origen);
                pbOrigen.sendKeys(Keys.ARROW_DOWN);
                pbOrigen.sendKeys(Keys.ENTER);

                pbDestino.sendKeys(destino);
                pbDestino.sendKeys(Keys.ARROW_DOWN);
                pbDestino.sendKeys(Keys.ENTER);
            }
            case "itinerario" -> {
                origenIter.sendKeys(origen);
                origenIter.sendKeys(Keys.ARROW_DOWN);
                origenIter.sendKeys(Keys.ENTER);

                destinoIter.sendKeys(destino);
                destinoIter.sendKeys(Keys.ARROW_DOWN);
                destinoIter.sendKeys(Keys.ENTER);
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
