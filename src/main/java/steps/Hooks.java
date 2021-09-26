package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class Hooks {
    @Before
    public void setUp(){
//        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    @After
    public void tearDown(){
        WebDriverUtils.quitDriver();
    }
}