package com.demoqa.tests.alertsFrameWindows;

import com.demoqa.pages.AlertsFrameWidowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedIFramesTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectNestedIFrames().hideIframes();
    }
    @Test
    public void HandleNestedIFramesTest(){
        new AlertsFrameWidowsPage(driver).handleNestedIFrames();
    }
}
