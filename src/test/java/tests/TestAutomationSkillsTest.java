package tests;

import org.testng.annotations.Test;
import pageFactory.HomePage;

import static org.testng.Assert.assertEquals;
import static utils.Driver.getDriver;

public class TestAutomationSkillsTest extends Hooks {

    @Test
    public void test() {
        int actualSkillCount = new HomePage(getDriver())
                .openHomePage()
                .openCareersMenu()
                .selectVacanciesMenuOption()
                .selectTAVacancy()
                .countSkills();
        assertEquals(actualSkillCount, 1);
    }
}
