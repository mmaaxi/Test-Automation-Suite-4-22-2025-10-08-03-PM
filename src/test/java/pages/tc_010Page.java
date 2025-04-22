package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    private WebDriver driver;

    // Locators
    private By cargaDocumentosButton = By.id("upload-button");
    private By historialDeSolicitudesLink = By.id("historial-link");
    private By documentosGuardadosSection = By.id("documentos-guardados");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCargaDocumentos() {
        driver.get("https://example.com/carga-documentos");
    }

    public void completarCargaDocumentos() {
        driver.findElement(cargaDocumentosButton).click();
        // Aquí deberías añadir más lógica para subir efectivamente los documentos
    }

    public boolean verificarGuardadoDeDocumentos() {
        // Lógica para verificar que los documentos se guardaron correctamente
        return driver.findElement(documentosGuardadosSection).isDisplayed();
    }

    public void accederHistorialDeSolicitudes() {
        driver.findElement(historialDeSolicitudesLink).click();
    }

    public boolean verificarVisualizacionCorrectaDeHistorial() {
        // Lógica para verificar la visualización correcta del historial
        return driver.findElement(documentosGuardadosSection).isDisplayed();
    }
}