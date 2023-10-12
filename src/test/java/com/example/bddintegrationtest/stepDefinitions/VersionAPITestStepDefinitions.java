package com.example.bddintegrationtest.stepDefinitions;

import com.example.bddintegrationtest.common.CommonHttpClient;
import com.example.bddintegrationtest.common.CucumberTestConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import static org.junit.Assert.*;

public class VersionAPITestStepDefinitions {
    private final Logger log = LoggerFactory.getLogger(VersionAPITestStepDefinitions.class);

    @Autowired
    private CommonHttpClient commonHttpClient;
    private String getResponse;

    @When("^the client calls /version$")
    public void the_client_issues_GET_version() {
        getResponse = commonHttpClient.getContents("/version");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        HttpStatusCode currentStatusCode = commonHttpClient.getResponseCode("/version");
        assertEquals("status code is incorrect : ",
                currentStatusCode.value(), statusCode);
    }

    @And("^the client receives server response (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        assertEquals("Incorrect version : ",
                commonHttpClient.getContents("/version"), version);
    }
}
