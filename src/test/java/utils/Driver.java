package utils;

import exceptions.UnsupportedBrowserException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver createDriverInstance() throws UnsupportedBrowserException {
        String browser = System.getProperty("browser") != null ? System.getProperty("browser") : "chrome";
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
                throw new exceptions.UnsupportedBrowserException("Unsupported browser. \nSupported browsers are: Chrome, Firefox, Edge and Opera");
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void killDriverInstance() {
        if (driver != null) {
            driver.quit();
        }
    }
}
