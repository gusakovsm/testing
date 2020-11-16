package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TestAutomationVacancyPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Test Automation Engineer']")
    private WebElement header;
    @FindBy(xpath = "//div[contains(@class, 'active')]//*[text()='Professional skills and qualification:']/parent::*/parent::*/following-sibling::p[1]/br")
    private List<WebElement> skillsDelimiters;

    public TestAutomationVacancyPage(WebDriver driver) {
        super(driver);
    }

    public int countSkills() {
        waitForElementToBeVisible(header);
        return skillsDelimiters.size() + 1;
    }
}
