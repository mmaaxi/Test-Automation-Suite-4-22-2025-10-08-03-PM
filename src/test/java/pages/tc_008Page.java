package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_008Page {
    WebDriver driver;
    WebDriverWait wait;
    private static final int TIME_LIMIT = 30; // seconds

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, TIME_LIMIT);
    }

    public void loadScannedDocument() {
        driver.findElement(By.id("uploadButton")).sendKeys("/path/to/scanned/document");
    }

    public void submitFileToOCRMETIQ() {
        driver.findElement(By.id("submitButton")).click();
    }

    public boolean isProcessingTimeWithinLimit() {
        long startTime = System.currentTimeMillis();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("extractedData")));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime) / 1000; // convert to seconds
        return duration <= TIME_LIMIT;
    }

    public boolean hasExcessiveDelays() {
        // Implement logic to check for excessive delays in the UI
        // Placeholder for demonstration purposes
        return false;
    }
}