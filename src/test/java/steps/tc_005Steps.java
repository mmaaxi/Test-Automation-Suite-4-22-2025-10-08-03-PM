package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page = new tc_005Page(driver);

    @Given("El usuario ha cargado un documento")
    public void el_usuario_ha_cargado_un_documento() {
        page.uploadDocument("path/to/file");
    }

    @When("La vista previa del archivo es visible")
    public void la_vista_previa_del_archivo_es_visible() {
        Assert.assertTrue(page.isPreviewVisible());
    }

    @Then("El nombre, tamaño y tipo se muestra correctamente")
    public void el_nombre_tamano_y_tipo_se_muestra_correctamente() {
        Assert.assertTrue(page.isFileInfoCorrect());
    }

    @Given("Un archivo está en la vista previa")
    public void un_archivo_esta_en_la_vista_previa() {
        Assert.assertTrue(page.isFileInPreview());
    }

    @When("El usuario elimina el archivo")
    public void el_usuario_elimina_el_archivo() {
        page.deleteFile();
    }

    @Then("El archivo ya no aparece en la lista de carga")
    public void el_archivo_ya_no_aparece_en_la_lista_de_carga() {
        Assert.assertFalse(page.isFileInList());
    }
}