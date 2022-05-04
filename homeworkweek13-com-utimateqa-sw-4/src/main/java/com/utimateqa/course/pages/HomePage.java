package com.utimateqa.course.pages;

import com.utimateqa.course.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signInLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']//a[contains(text(),'Sign In')]");

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }


}
