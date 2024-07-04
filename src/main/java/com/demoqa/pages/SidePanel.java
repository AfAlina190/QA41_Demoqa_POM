package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Login']")
    WebElement login;
    public LoginPage selectLogin() {
        clickWithJs(login, 0,500);
        return new LoginPage(driver);

    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;
    public AlertsFrameWidowsPage selectAlerts() {
        click(alerts);
        return new AlertsFrameWidowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;
    public AlertsFrameWidowsPage selectFrames() {
        clickWithJs(frames, 0, 300);
        return new AlertsFrameWidowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Nested Frames']")
    WebElement nestedFrames;
    public AlertsFrameWidowsPage selectNestedIFrames() {
        clickWithJs(nestedFrames,0,300);
        return new AlertsFrameWidowsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public AlertsFrameWidowsPage selectBrowserWindows() {
        click(browserWindows);
        return new AlertsFrameWidowsPage(driver);

    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public WidgetsPage getSelectMenu() {
        clickWithJs(selectMenu,0,600);
        return new WidgetsPage(driver);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;
    public WidgetsPage selectSlider() {
        clickWithJs(slider,0,300);
        return new WidgetsPage(driver);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;
    public WidgetsPage getMenu() {
        clickWithJs(menu,0,400);
        return new WidgetsPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;
    public InteractionsPage selectDroppable() {
        clickWithJs(droppable, 0, 300);
        return new InteractionsPage(driver);
    }

    @FindBy(xpath = "//span[.='Tool Tips']")
    WebElement toolTips;
    public WidgetsPage slectToolTips() {
        clickWithJs(toolTips,0,600);
        return new WidgetsPage(driver);

    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;
    public ElementsPage selectButtons() {
        clickWithJs(buttons,0,100);
        return new ElementsPage(driver);
    }

    @FindBy(xpath = "//span[.='Upload and Download']")
    WebElement upload;
    public ElementsPage selectUpload() {

        clickWithJs(upload,0,300);

        return new ElementsPage(driver);
    }


    @FindBy(xpath = "//span[.='Auto Complete']")
    WebElement autoComplete;
    public WidgetsPage selectAutoComplete() {
        clickWithJs(autoComplete,0,300);
        return new WidgetsPage(driver);
    }

    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;
    public ElementsPage selectTextBox() {
        click(textBox);
        return new ElementsPage(driver);
    }

    @FindBy(xpath = "//span[.='Links']")
    WebElement links;
    public ElementsPage selectLinks() {
        clickWithJs(links,0,300);
        return new ElementsPage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement linksImages;
    public ElementsPage selectBrokenLinksImages() {
        clickWithJs(linksImages,0,300);
        return new ElementsPage(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public FormsPage selectPrscticeForm() {

        click(practiceForm);

        return new FormsPage(driver);
    }
}









