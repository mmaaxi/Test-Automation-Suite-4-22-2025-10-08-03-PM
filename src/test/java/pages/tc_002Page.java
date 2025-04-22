package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_002Page {
    WebDriver driver;
    WebDriverWait wait;
    
    private By uploadButton = By.id("uploadButton");
    private By errorMessage = By.id("errorMessage");
    
    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }
    
    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }
    
    public void uploadLargeFile() {
        WebElement uploadBtn = wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
        uploadBtn.sendKeys("path/to/file/larger/than/50MB");
    }
    
    public boolean isErrorMessageDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).isDisplayed();
    }
    
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}