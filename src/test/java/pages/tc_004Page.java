package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class tc_004Page {
    private WebDriver driver;

    private By uploadBoxLocator = By.id("upload-box");
    private By filePreviewListLocator = By.id("file-preview-list");
    private By confirmButtonLocator = By.id("confirm-upload");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void dragAndDropFiles() {
        WebElement uploadBox = driver.findElement(uploadBoxLocator);
        // Simulate a drag-and-drop action
        new Actions(driver).moveToElement(uploadBox).clickAndHold()
                .moveByOffset(0, 0).release().perform();
    }

    public void verifyFilesListedInPreview() {
        WebElement filePreviewList = driver.findElement(filePreviewListLocator);
        assert filePreviewList.isDisplayed();
        // Additional checks for file names, etc, would be done here
    }

    public void confirmFileUpload() {
        driver.findElement(confirmButtonLocator).click();
    }

    public void verifyFilesUploadedSuccessfully() {
        // Logic to verify that the upload was successful, e.g., a confirmation message or file list update
        WebElement confirmation = driver.findElement(By.id("upload-confirmation"));
        assert confirmation.isDisplayed();
    }
}