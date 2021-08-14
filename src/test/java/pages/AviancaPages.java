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

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[3]/div/div[1]/div[3]/div[3]/div[29]")
    WebElement  pbFechaIdaDaySelected;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[3]/div/div[1]/div[4]/div[3]/div[9]")
    WebElement pbFechaRegresoDaySelected;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]/div/div/section/div[3]/div[4]/div[1]/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button")
    WebElement pbTrip;

    @FindBy(xpath = "//a[contains(@data-target, '#menu-abierto')]")
    WebElement menuGlobal;

    @FindBy(id = "origenIter")
    WebElement origenIter;

    @FindBy(id = "destinoIter")
    WebElement destinoIter;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[3]/div[1]/div[1]/label/div/input[1]")
    WebElement fechaIdaIter;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/label/div/input[1]")
    WebElement fechaRegresoIter;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[3]/div[1]/div[3]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[5]/td[1]/div")
    WebElement fechaIdaIterDaySelected;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[3]/div[2]/div[3]/div[1]/table/tbody/tr/td[2]/div[3]/table/tbody/tr[2]/td[2]/div")
    WebElement fechaRegresoIterDaySelected;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div[3]/section/div[2]/form/div/div[2]/div[5]/div/input[2]")
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

    public String getCurrentPageTitle(){
        return webDriver.getTitle();
    }

    public void aviancaItinerarios() {
        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-abierto\"]/div/div/div[2]/div/div[4]/div/div/div[3]/div/ul/li[1]/a"))).click();
    }

    public void ingresarOrigenDestino(String origen, String destino, String tipoAccion){
        switch (tipoAccion) {
            case "reserva" -> {
                pbOrigen.click();
                pbOrigen.sendKeys(origen + Keys.ARROW_DOWN + Keys.ENTER);

                pbDestino.click();
                pbDestino.sendKeys(destino + Keys.ARROW_DOWN + Keys.ENTER);
            }
            case "itinerario" -> {
                origenIter.click();
                origenIter.sendKeys(origen + Keys.ARROW_DOWN + Keys.ENTER);

                destinoIter.click();
                destinoIter.sendKeys(destino + Keys.ARROW_DOWN + Keys.ENTER);
            }
        }
    }

    public void ingresarFechas(String diaIda, String diaRegreso, String tipoAccion){
        switch (tipoAccion) {
            case "reserva" -> {
                pbFechaIda.click();
                pbFechaIdaDaySelected.click();

                pbFechaRegreso.click();
                pbFechaRegresoDaySelected.click();
            }
            case "itinerario" -> {
                fechaIdaIter.click();
                fechaIdaIterDaySelected.click();

                fechaRegresoIter.click();
                fechaRegresoIterDaySelected.click();
            }
        }
    }

    public void buscarVuelos(){ pbTrip.submit(); }

    public void buscarHorarios(){ mainContent_Ir.submit(); }
}
