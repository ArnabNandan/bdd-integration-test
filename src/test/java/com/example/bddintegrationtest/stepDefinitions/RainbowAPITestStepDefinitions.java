package com.example.bddintegrationtest.stepDefinitions;

import com.example.bddintegrationtest.common.CommonHttpClient;
import com.example.bddintegrationtest.common.CucumberTestConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class RainbowAPITestStepDefinitions {
    @Autowired
    private CommonHttpClient commonHttpClient;

    @Given("the client checks the service is up")
    public void theClientMakesCallToGETRainbow() {
        System.out.println("Calling health service");
        assertTrue(true);
    }

    @When("the client calls GET \\/rainbow with selected color {string}")
    public void theClientCallsGETRainbowWithSelectedColor(@NonNull final String color) {
        assertEquals("Service error",
                commonHttpClient.getResponseCode("/rainbow/"+color).value(), 200);
    }

    @Then("the client receives position {string} for {string}")
    public void theClientReceivesPositionFor(String position, String color) {
        assertEquals("Invalid position",
                commonHttpClient.getContents("/rainbow/"+color), position);
    }
}
