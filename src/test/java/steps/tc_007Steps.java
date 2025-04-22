package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("el usuario ha seleccionado un archivo para cargar")
    public void el_usuario_ha_seleccionado_un_archivo_para_cargar() {
        page.selectFileForUpload();
    }

    @When("el sistema da un error en la carga inicial")
    public void el_sistema_da_un_error_en_la_carga_inicial() {
        page.triggerInitialUploadError();
    }

    @Then("el archivo es mostrado en la lista de carga")
    public void el_archivo_es_mostrado_en_la_lista_de_carga() {
        Assert.assertTrue(page.isFileDisplayedInUploadList());
    }

    @When("el usuario hace clic en la opción eliminar sobre el archivo cargado")
    public void el_usuario_hace_clic_en_la_opción_eliminar_sobre_el_archivo_cargado() {
        page.clickDeleteOnUploadedFile();
    }

    @Then("el archivo es removido de la lista de carga")
    public void el_archivo_es_removido_de_la_lista_de_carga() {
        Assert.assertFalse(page.isFileDisplayedInUploadList());
    }
}