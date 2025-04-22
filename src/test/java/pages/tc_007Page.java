package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;

    By fileUploadInput = By.id("fileUpload");
    By uploadList = By.id("uploadList");
    By deleteButton = By.className("delete-file");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFileForUpload() {
        // Simulación de selección de archivo
        driver.findElement(fileUploadInput).sendKeys("path/to/file");
    }

    public void triggerInitialUploadError() {
        // Simulación de error durante la carga
        // Esto puede implicar una operación especial para generar el error de carga
    }

    public boolean isFileDisplayedInUploadList() {
        // Comprobar si el archivo está presente en la lista de carga
        return driver.findElements(uploadList).stream()
            .anyMatch(element -> element.getText().contains("file"));
    }

    public void clickDeleteOnUploadedFile() {
        // Hacer clic en el botón de eliminar para el archivo cargado
        driver.findElement(deleteButton).click();
    }
}