package com.demoqa.tests.widgets;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.WidgetsPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTippTest extends TestBase {
    @BeforeMethod
    public void preconditon(){
        new HomePage(driver).getWidgets();
        new SidePanel(driver).slectToolTips().hideIframes();
    }

    @Test
    public void toolTipsTest(){
        new WidgetsPage(driver).hoverToolTip()
                .verifyToolTip("contraryTexToolTip");
    }
}
