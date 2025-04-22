package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadOption = By.id("documentUploadOption");
    By fileInput = By.id("uploadFileInput");
    By preview = By.id("filePreview");
    By confirmUploadButton = By.id("confirmUpload");
    By successNotification = By.id("uploadSuccessNotification");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToIntakePortal() {
        driver.get("https://portal.intake.com");
    }

    public void selectDocumentUploadOption() {
        wait.until(ExpectedConditions.elementToBeClickable(uploadOption)).click();
    }

    public boolean isUploadOptionDisplayed() {
        return driver.findElement(uploadOption).isDisplayed();
    }

    public void selectPDFFile(String fileName) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(System.getProperty("user.dir") + "/files/" + fileName);
    }

    public boolean isFilePreviewDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(preview)).isDisplayed();
    }

    public void confirmFileUpload() {
        driver.findElement(confirmUploadButton).click();
    }

    public boolean isUploadSuccessNotificationDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successNotification)).isDisplayed();
    }
}