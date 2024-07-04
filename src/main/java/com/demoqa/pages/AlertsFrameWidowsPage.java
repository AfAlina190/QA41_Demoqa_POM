package com.demoqa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AlertsFrameWidowsPage extends BasePage{
    public AlertsFrameWidowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;
    public AlertsFrameWidowsPage waitAlert() {
        click(timerAlertButton);
        new WebDriverWait(driver,Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent()).accept();
        return this;
    }

    @FindBy(id = "confirmButton")
    WebElement confirmButton;

    public AlertsFrameWidowsPage selectResult(String text) {
        clickWithJs(confirmButton, 0, 300);

        if(text != null && text.equals("Ok")){
            driver.switchTo().alert().accept();
        }else if (text != null && text.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;
    public AlertsFrameWidowsPage verifyResult(String result) {
        Assert.assertTrue(shouldHaveText(confirmResult, result, 5));
        return this;
    }

    @FindBy(id = "promtButton")
    WebElement promtButton;
    public AlertsFrameWidowsPage sendMessageToAlert(String message) {
        clickWithJs(promtButton,0,300);
        if (message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }

        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;
    public AlertsFrameWidowsPage verifyMessage(String message) {
        Assert.assertTrue(shouldHaveText(promptResult,message,5));
        return this;
    }

    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    public AlertsFrameWidowsPage getListOfIFrames() {
        //by finding all the web elements using iframes tag
       // System.out.println("Number of iframes on the page are "+ iframes.size());

        //by using JS
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer numberOfIFrames = Integer.parseInt(js.executeScript("return window.length").toString());
        System.out.println("umber of iframes on the page are "+ numberOfIFrames);
        return this;
    }


    public AlertsFrameWidowsPage switchToIFrameByIndex(int index) {

        driver.switchTo().frame(index);
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;
    public AlertsFrameWidowsPage verifyIframeText(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text,5));
        return this;
    }

    @FindBy(id = "frame1")
    WebElement frame1;
    public AlertsFrameWidowsPage switchToIframeByID() {
        driver.switchTo().frame(frame1);
        return this;
    }

    public AlertsFrameWidowsPage returnToMainContent() {
        driver.switchTo().defaultContent();
        return this;
    }

    @FindBy(css = "#framesWrapper>div")
    WebElement mainContentText;

    public AlertsFrameWidowsPage verifyMainContentText(String text) {
        Assert.assertTrue(mainContentText.getText().contains(text));
        return this;
    }

    @FindBy(css = "body")
    WebElement body;

    public AlertsFrameWidowsPage handleNestedIFrames() {
        System.out.println("Number of iframes on the page are "+ iframes.size());

        //switch to parent iframe
        driver.switchTo().frame(frame1);
        //get text from parent iframe
        System.out.println("IFrame 1 is "+ body.getText());
        //get number of iframes on parent iframe
        System.out.println("Number of iframes on the parent iframe are " + iframes.size());

        //switch to child iframe
        driver.switchTo().frame(0);
        //get text from child iframe
        System.out.println("IFrame is " + body.getText());

        //switch to parent iframe
        driver.switchTo().parentFrame(); // --> из текущего в родительскй

        //driver.switchTo().defaultContent(); --> откуда угодно можем попасть на главную страницу
        System.out.println("IFrame 1 is "+ body.getText());
        return this;
    }

    @FindBy(id = "tabButton")
    WebElement tabButton;
    public AlertsFrameWidowsPage switchToNewTab(int index) {

        click(tabButton);

        List<String>tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));

        return this;
    }


    public AlertsFrameWidowsPage verifyNewTabTitle(String title) {
        Assert.assertTrue(shouldHaveText(sampleHeading,title,5));
        return this;
    }
}
