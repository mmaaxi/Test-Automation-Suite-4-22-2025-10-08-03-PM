package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    private WebDriver driver;
    private tc_010Page page;

    public tc_010Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_010Page(driver);
    }

    @Given("el usuario ha iniciado sesión y está en la página de carga de documentos")
    public void usuario_iniciado_sesion_en_pagina_carga_documentos() {
        page.navegarAPaginaDeCargaDocumentos();
    }

    @When("completa el proceso de carga de documentos exitosamente")
    public void completar_proceso_carga_documentos() {
        page.completarCargaDocumentos();
    }

    @Then("el sistema guarda una copia de los archivos originales y los datos extraídos")
    public void sistema_guarda_copia_archivos_y_datos() {
        Assert.assertTrue(page.verificarGuardadoDeDocumentos());
    }

    @When("revisa el historial de la solicitud de cotización")
    public void revisar_historial_solicitud_cotizacion() {
        page.accederHistorialDeSolicitudes();
    }

    @Then("se visualizan correctamente las copias de los documentos y los resultados extraídos")
    public void visualizar_documentos_y_resultados() {
        Assert.assertTrue(page.verificarVisualizacionCorrectaDeHistorial());
    }
}