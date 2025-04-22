package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_009Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadButton = By.id("upload_button_id");
    By errorMessage = By.id("error_message_id");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void navigateToUploadPage() {
        driver.navigate().to("http://example.com/upload");
    }

    public void uploadInvalidFile(String fileName) {
        WebElement uploadElement = wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
        uploadElement.sendKeys(System.getProperty("user.dir") + "/resources/" + fileName);
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return errorElement.isDisplayed();
    }

    public boolean isErrorMessageClearAndDescriptive() {
        WebElement errorElement = driver.findElement(errorMessage);
        String errorText = errorElement.getText();
        return errorText.contains("invalid format") && errorText.contains("cannot upload .exe files");
    }

    public boolean doesMessageIndicateCauseAndRecommendations() {
        WebElement errorElement = driver.findElement(errorMessage);
        String errorText = errorElement.getText();
        return errorText.contains("Please upload supported file types like .jpg, .png, .pdf");
    }
}