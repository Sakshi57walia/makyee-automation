package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;

public class MakyeePropertyListPageTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up the WebDriver instance
        String driverPath = Objects.requireNonNull(MakyeePropertyListPageTest.class.getClassLoader().getResource("chromedriver")).getPath();

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makyee.com/");
    }

    @AfterMethod
    public void tearDown() {
        // Close the WebDriver instance
        driver.quit();
    }

    @Test
    public void verifyGuestFavouriteFeature() {

        WebElement favoriteButton = driver.findElement(By.xpath("//*[@id=\"site\"]/section[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/div[4]/div[1]"));
        favoriteButton.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(favoriteButton).perform();
        // Wait for the div to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement transientElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-html-container")));
//        if (transientElement.isDisplayed()) {
//            System.out.println("Element is visible: " + transientElement.getText());
//        }
        Assert.assertEquals(transientElement.getText(), "You need to login first");
    }
}