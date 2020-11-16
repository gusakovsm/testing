package tests;

import exceptions.UnsupportedBrowserException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Driver;

public class Hooks {

    @BeforeTest
    public void beforeTest() throws UnsupportedBrowserException {
        Driver.createDriverInstance();
    }

    @AfterTest
    public void afterTest() {
        Driver.killDriverInstance();
    }
}
