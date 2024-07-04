package com.demoqa.tests.alertsFrameWindows;

import com.demoqa.pages.AlertsFrameWidowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFramesTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectFrames();

    }
    @Test
    public void framesTest(){
        new AlertsFrameWidowsPage(driver).getListOfIFrames();
    }

    @Test
    public void switchTolIFrameByIndexTest(){
        new AlertsFrameWidowsPage(driver).switchToIFrameByIndex(2)
                .verifyIframeText("This is a sample page");
    }
    @Test
    public void switchToIframeByIDTest(){
        new AlertsFrameWidowsPage(driver).switchToIframeByID().returnToMainContent()
                .verifyMainContentText("There are 2 Iframes in this page");
    }
}
