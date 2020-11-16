package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

import static utils.PropertyFileManager.getProperties;

public class HomePage extends BasePage {
    private static Properties config = getProperties("selenium.properties");

    @FindBy(xpath = "//a[contains(@href, 'careers') and text()='Careers']")
    private WebElement careersMenu;
    @FindBy(xpath = "//a[contains(@href, 'vacancies') and text()='Vacancies']")
    private WebElement vacancies;
    @FindBy(css = "#header")
    private WebElement EXAMPLE; //TODO CSS Selector Example. To be deleted after

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(config.getProperty("url"));
        return this;
    }

    public HomePage openCareersMenu() {
        waitForElementToBeVisible(careersMenu).click();
        return this;
    }

    public VacanciesPage selectVacanciesMenuOption() {
        waitForElementToBeVisible(vacancies).click();
        return new VacanciesPage(driver);
    }
}
