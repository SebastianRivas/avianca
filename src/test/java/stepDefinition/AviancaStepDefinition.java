package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.AviancaSteps;

import java.util.concurrent.TimeUnit;

public class AviancaStepDefinition {
    private WebDriver webDriver = null;
    AviancaSteps aviancaSteps = null;

    @Before()
    public void init(){
        System.setProperty("webdriver.chrome.driver", "src/webdriver/bin/chromedriver.exe");
        webDriver = new ChromeDriver();
        aviancaSteps = new AviancaSteps(webDriver);
    }

    @Given("Ingreso a la pagina web de avianca")
    public void ingreso_a_la_pagina_web_de_avianca() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        aviancaSteps.ingresarAlPortalWeb();
    }

    @When("Selecciono la ciudad de {string} y la ciudad {string} ademas de la fecha de {string} y la fecha de {string}")
    public void selecciono_la_ciudad_de_y_la_ciudad_ademas_de_la_fecha_de_y_la_fecha_de(String string, String string2, String string3, String string4) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        aviancaSteps.buscarReservas(string, string2, string3, string4);
    }

    @Then("Obtengo el listado de vuelos para reservar junto con sus precios")
    public void obtengo_el_listado_de_vuelos_para_reservar_junto_con_sus_precios() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Ingreso a la pagina web de avianca y accedo al menu")
    public void ingreso_a_la_pagina_web_de_avianca_y_accedo_al_menu() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        aviancaSteps.ingresarAlPortalWeb();
        aviancaSteps.accederMenuPrincipal();
        aviancaSteps.ingresarAlPortalItinerarios();
    }

    @When("Ingreso la ciudad de {string} y la ciudad {string} ademas de la fecha de {string} y la fecha de {string} para ver los horarios de vuelo disponibles")
    public void ingreso_la_ciudad_de_y_la_ciudad_ademas_de_la_fecha_de_y_la_fecha_de_para_ver_los_horarios_de_vuelo_disponibles(String string, String string2, String string3, String string4) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        aviancaSteps.buscarItinerario(string, string2, string3, string4);
    }

    @Then("Obtengo el listado de horarios de vuelos y los organizo dependiendo de la fecha de salida")
    public void obtengo_el_listado_de_horarios_de_vuelos_y_los_organizo_dependiendo_de_la_fecha_de_salida() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After()
    public void finish(){
        webDriver.close();
    }
}
