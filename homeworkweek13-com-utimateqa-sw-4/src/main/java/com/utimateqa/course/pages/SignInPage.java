package com.utimateqa.course.pages;

import com.utimateqa.course.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By signInLink= By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a[contains(text(),'Sign In')]");
    By welcomeText= By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField=By.xpath("//input[@id='user[email]']");
    By passwordField=By.xpath("//input[@id='user[password]']");
    By signInButton=By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By varifyErrorMsg=By.xpath("//li[@class='form-error__list-item']");

    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
    // In this method it gives return String so mention return
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void  sendEmailText(String email){
        sendTextToElement(emailField,"email");
    }
     public void sendpasswordText(String password){
        sendTextToElement(passwordField,"password");
     }

   public void clickOnSignButton(){
        clickOnElement(signInButton);
   }

   public String  varifyErrorMessage(){
        return getTextFromElement(varifyErrorMsg);

   }


}
