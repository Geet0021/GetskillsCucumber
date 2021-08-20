package Managers;

import PageObjects.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    private WebDriver driver;

    private LoginPage loginPage;
    private SignUpPage signUpPage;
    private PublicCourses publicCourses;
    private RegisterNewEmployer registerNewEmployer;
    private BackgroundDemoPage backgroundDemoPage;

    public PageObjectManager (WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage ( ) {
        return (loginPage == null) ? loginPage = new LoginPage ( driver ) : loginPage;}

    public SignUpPage getSignUpPage ( ) {
        return (signUpPage == null) ? signUpPage = new SignUpPage ( driver ) : signUpPage;}

    public PublicCourses getPublicCourses ( ) {
        return (publicCourses  == null)? publicCourses = new  PublicCourses (driver): publicCourses;}

    public RegisterNewEmployer  getRegisterNewEmployer() {
        return ( registerNewEmployer == null)? registerNewEmployer =new RegisterNewEmployer (driver): registerNewEmployer;}

    public BackgroundDemoPage getBackgroundDemoPage ( ) {
        return (backgroundDemoPage == null)? backgroundDemoPage =new BackgroundDemoPage ( driver):backgroundDemoPage;}
    }

