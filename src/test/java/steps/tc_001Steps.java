package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;
import static org.junit.Assert.*;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("que estoy en el portal de Intake")
    public void que_estoy_en_el_portal_de_Intake() {
        page.navigateToIntakePortal();
    }

    @When("selecciono la opción de 'Carga de documentos'")
    public void selecciono_la_opción_de_Carga_de_documentos() {
        page.selectDocumentUploadOption();
    }

    @Then("la opción de carga se muestra correctamente")
    public void la_opción_de_carga_se_muestra_correctamente() {
        assertTrue(page.isUploadOptionDisplayed());
    }

    @When("selecciono un archivo de documento en formato PDF")
    public void selecciono_un_archivo_de_documento_en_formato_PDF() {
        page.selectPDFFile("Carta_de_exclusividad.pdf");
    }

    @Then("el sistema acepta el archivo y muestra la vista previa")
    public void el_sistema_acepta_el_archivo_y_muestra_la_vista_previa() {
        assertTrue(page.isFilePreviewDisplayed());
    }

    @When("confirmo la carga del documento")
    public void confirmo_la_carga_del_documento() {
        page.confirmFileUpload();
    }

    @Then("el sistema procesa el archivo y notifica carga exitosa")
    public void el_sistema_procesa_el_archivo_y_notifica_carga_exitosa() {
        assertTrue(page.isUploadSuccessNotificationDisplayed());
    }
}