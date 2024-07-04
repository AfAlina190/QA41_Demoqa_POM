package com.demoqa.tests.forms;

import com.demoqa.pages.FormsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StudentFormTest extends TestBase {

    @BeforeMethod
    public void  precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPrscticeForm().hideIframes();
    }

    @Test
    @Parameters({"firstName","lastName","email","phone"})
    public void createStudentAccountPositiveTest(String firstName, String lastName, String email, String phone){
        new FormsPage(driver).enterPersonalData(firstName,lastName,email,phone)
                .enterPersonalData("Ali","Afo","afali@gm.com","1234567890")
                .selectGender("Female")
//                .enterDate("24 Jul 1991")
                .selectDate("July","1991","24")
                .selectSubjects(new String[]{"Maths","Chemistry"})
                .selectHobbies(new String[]{"Music","Reading"})
                .uploadFile("C:/Users/afali/Downloads/img.png")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit()
                .verifySuccessRegistration("Thanks for submitting the form");

    }
}
