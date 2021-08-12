package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.AviancaSteps;

public class AviancaStepDefinition {
    WebDriver webDriver = null;
    AviancaSteps aviancaSteps = null;

    @Before
    public void init(){
        System.setProperty("webdriver.gecko.driver", "src/webdriver/bin/geckodriver.exe");
        webDriver = new FirefoxDriver();
        aviancaSteps = new AviancaSteps(webDriver);
    }

    @After
    public void finish(){
        webDriver.close();
    }

    @Given("Ingreso a la pagina web de avianca")
    public void ingreso_a_la_pagina_web_de_avianca() {
        aviancaSteps.ingresarAlPortalWeb();
        throw new io.cucumber.java.PendingException();
    }

    @When("Selecciono la ciudad de {string} y la ciudad {string} ademas de la fecha de {string} y la fecha de {string} con {string}")
    public void selecciono_la_ciudad_de_y_la_ciudad_ademas_de_la_fecha_de_y_la_fecha_de_con(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Obtengo el listado de vuelos para reservar junto con sus precios")
    public void obtengo_el_listado_de_vuelos_para_reservar_junto_con_sus_precios() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
