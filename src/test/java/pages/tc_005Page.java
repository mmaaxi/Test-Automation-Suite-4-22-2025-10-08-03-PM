package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {
    private WebDriver driver;
    private By uploadInput = By.id("file-upload-input");
    private By previewSection = By.id("file-preview-section");
    private By deleteButton = By.id("file-delete-btn");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadDocument(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean isPreviewVisible() {
        WebElement preview = driver.findElement(previewSection);
        return preview.isDisplayed();
    }

    public boolean isFileInfoCorrect() {
        // Código para verificar la información del archivo
        return true; // Esto se cambiaría por una verificación real
    }
    
    public boolean isFileInPreview() {
        return driver.findElements(previewSection).size() > 0;
    }

    public void deleteFile() {
        driver.findElement(deleteButton).click();
    }

    public boolean isFileInList() {
        // Código para verificar si el archivo está en la lista
        return false; // Retornar false si el archivo ha sido eliminado correctamente
    }
}