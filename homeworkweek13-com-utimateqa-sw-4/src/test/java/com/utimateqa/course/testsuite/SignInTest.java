package com.utimateqa.course.testsuite;



import com.utimateqa.course.pages.HomePage;
import com.utimateqa.course.pages.SignInPage;
import com.utimateqa.course.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase {

       HomePage homePage= new HomePage();
       SignInPage siginin=new SignInPage();
       @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
       homePage.clickOnSignInLink();
         String expectedMessage="Welcome Back!";
         String actualMessage=siginin.getWelcomeText();
           Assert.assertEquals(expectedMessage,actualMessage,"Signin page not displayed");

       }
        @Test
    public void verifyTheErrorMessage (){
           homePage.clickOnSignInLink();
          siginin.sendEmailText("prime123@gmail.com");
           siginin.sendpasswordText("prime123");
           siginin.clickOnSignButton();
           siginin.varifyErrorMessage();
        }



}
