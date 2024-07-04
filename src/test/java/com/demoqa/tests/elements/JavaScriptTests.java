package com.demoqa.tests.elements;

import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectTextBox();
    }

    @Test
    public void JSExecutorTest(){
        new ElementsPage(driver).enterDataWithJS("Ali Afo","aliafo@gm.com")
                .clickOnSubmitButtonWithJS()
                .getInnerTextWithJS()
                .refreshWithJS()
                .getInnerTextWithJS()
                .checkURLWithJS()
                .navigateToNewPageWithJS("https://maven.apache.org/download.cgi")
                .verifyTitleOfPageWithJS()
                .generateAlertWithJS();
    }
}
