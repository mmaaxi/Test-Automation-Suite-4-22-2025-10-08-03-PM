package steps;

import pages.tc_009Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario está en la página de carga de archivos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_archivos() {
        page.navigateToUploadPage();
    }

    @When("intenta cargar un archivo con extensión \".exe\"")
    public void intenta_cargar_un_archivo_con_extension_exe() {
        page.uploadInvalidFile("archivo.exe");
    }

    @Then("el sistema debe rechazar el archivo")
    public void el_sistema_debe_rechazar_el_archivo() {
        assertTrue(page.isErrorMessageDisplayed());
    }

    @Then("se debe mostrar un mensaje de error claro y descriptivo")
    public void se_debe_mostrar_un_mensaje_de_error_claro_y_descriptivo() {
        assertTrue(page.isErrorMessageClearAndDescriptive());
    }

    @Then("el mensaje debe indicar la causa del error y recomendaciones")
    public void el_mensaje_debe_indicar_la_causa_del_error_y_recomendaciones() {
        assertTrue(page.doesMessageIndicateCauseAndRecommendations());
    }
}