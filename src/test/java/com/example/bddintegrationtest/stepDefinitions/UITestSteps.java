//package com.example.bddintegrationtest.stepDefinitions;
//
//import io.cucumber.java.After;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class UITestSteps{
//
////Opening Firefox Browser and launching the login page of application
//
//    private final WebDriver driver = new FirefoxDriver();
//
//    @Given("user navigates to login page by opening Firefox")
//    public void user_navigates_to_login_page_by_opening_firefox() {
//        driver.get("http://localhost:8083/actuator");
//    }
//
//    //Entering correct username and password values
//    @When("user enters correct {string} AND {string} values")
//    public void userEntersCorrectANDValues(String username, String password) {
////        driver.findElement(By.xpath(".//*[@id='username']/a")).sendkeys(username);
////        driver.findElement(By.xpath(".//*[@id='password']/a")).sendkeys(password);
//    }
//
//    //Open homepage upon login
//    @Then("user gets directed to homepage")
//    public void direct_to_homepage() throws Throwable
//    {
//        driver.get("Homepage url");
//    }
//
//
//
////    @After()
////    public void closeBrowser()
////    {
////        driver.quit();
////    }
//}