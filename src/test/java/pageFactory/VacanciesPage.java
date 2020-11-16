package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, 'test-automation-engineer') and text()='Test Automation Engineer']")
    private WebElement taVacancy;

    public VacanciesPage(WebDriver driver) {
        super(driver);
    }

    public TestAutomationVacancyPage selectTAVacancy() {
        waitForElementToBeVisible(taVacancy).click();
        return new TestAutomationVacancyPage(driver);
    }
}
