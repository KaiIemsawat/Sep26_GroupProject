package impl;

import pages.SauceDemoPage;
import utils.ConfigReader;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

import java.sql.SQLOutput;
import java.util.Set;

public class SauceDemoImpl {
    SauceDemoPage page;

    public SauceDemoPage getPage() {
        if (page == null)
            page = new SauceDemoPage();
        return page;
    }

    public void navigateToHomepage() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public String getText() {
        return getPage().errorMsg.getText();
    }
}
