package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;
    By separarDocumentosCheckbox = By.id("separarDocumentos");
    By recuadroCotizacion = By.id("recuadroCotizacion");
    By recuadroArt492 = By.id("recuadroArt492");
    By vistaPreviaCotizacion = By.id("vistaPreviaCotizacion");
    By vistaPreviaArt492 = By.id("vistaPreviaArt492");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCargaDeDocumentosPage() {
        driver.get("http://example.com/cargaDocumentos");
    }

    public void selectSepararCargaDeDocumentos() {
        driver.findElement(separarDocumentosCheckbox).click();
    }

    public boolean verificarDosRecuadrosVisibles() {
        return driver.findElement(recuadroCotizacion).isDisplayed() &&
               driver.findElement(recuadroArt492).isDisplayed();
    }

    public void cargarArchivoEnRecuadroCotizacion(String rutaArchivo) {
        driver.findElement(recuadroCotizacion).sendKeys(rutaArchivo);
    }

    public void cargarArchivoEnRecuadroArt492(String rutaArchivo) {
        driver.findElement(recuadroArt492).sendKeys(rutaArchivo);
    }

    public boolean verificarArchivosEnSecciones() {
        return driver.findElement(vistaPreviaCotizacion).isDisplayed() &&
               driver.findElement(vistaPreviaArt492).isDisplayed();
    }
}