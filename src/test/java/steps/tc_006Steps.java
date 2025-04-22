package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page = new tc_006Page(driver);

    @Given("^el usuario está en la página de carga de documentos$")
    public void usuarioEnPaginaDeCargaDeDocumentos() {
        page.navigateToCargaDeDocumentosPage();
    }

    @When("^el usuario selecciona la opción de cargar documentos separados para cotización y Art\\. 492$")
    public void usuarioSeleccionaOpcionDeCargaDocumentosSeparados() {
        page.selectSepararCargaDeDocumentos();
    }

    @Then("^el sistema muestra dos recuadros distintos para cada tipo de documento$")
    public void sistemaMuestraDosRecuadros() {
        Assert.assertTrue(page.verificarDosRecuadrosVisibles());
    }

    @When("^el usuario carga un archivo en cada recuadro y revisa la vista previa$")
    public void usuarioCargaArchivosEnRecuadros() {
        page.cargarArchivoEnRecuadroCotizacion("ruta_del_archivo_de_cotizacion");
        page.cargarArchivoEnRecuadroArt492("ruta_del_archivo_Art492");
    }

    @Then("^ambos archivos se muestran correctamente en sus respectivas secciones$")
    public void archivosMostradosCorrectamente() {
        Assert.assertTrue(page.verificarArchivosEnSecciones());
    }
}