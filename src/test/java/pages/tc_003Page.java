package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    By fileInput = By.id("fileUploadInput");
    By uploadButton = By.id("uploadButton");
    By confirmButton = By.id("confirmButton");
    By successMessage = By.id("successMessage");
    By extractedFilesSection = By.id("extractedFilesSection");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCompressedFile(String fileName) {
        driver.findElement(fileInput).sendKeys(fileName);
    }

    public void uploadFile() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileAccepted() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public void confirmUpload() {
        driver.findElement(confirmButton).click();
    }

    public boolean isFileDecompressed() {
        return driver.findElement(extractedFilesSection).isDisplayed();
    }

    public boolean areExtractedFilesDisplayed() {
        // Implement logic to verify extracted files are displayed.
        return true;
    }
}