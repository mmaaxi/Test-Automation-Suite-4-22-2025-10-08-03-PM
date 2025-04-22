package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_004Page;

public class tc_004Steps {
    private WebDriver driver = new ChromeDriver();
    private tc_004Page page = new tc_004Page(driver);

    @Given("que el usuario está en la página de carga de archivos")
    public void usuarioEnPaginaDeCargaDeArchivos() {
        page.navigateToUploadPage();
    }

    @When("el usuario arrastra y suelta archivos en el recuadro de carga")
    public void usuarioArrastraArchivos() {
        page.dragAndDropFiles();
    }

    @Then("los archivos se listan en la vista previa correctamente")
    public void archivosListadosEnVistaPrevia() {
        page.verifyFilesListedInPreview();
    }

    @When("el usuario confirma la carga de los archivos")
    public void usuarioConfirmaCargaArchivos() {
        page.confirmFileUpload();
    }

    @Then("el sistema carga los archivos sin errores y continua el proceso")
    public void sistemaCargaArchivos() {
        page.verifyFilesUploadedSuccessfully();
        driver.quit();
    }
}