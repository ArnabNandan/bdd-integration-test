package com.example.bddintegrationtest.common;

import lombok.NonNull;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class CommonHttpClient {
    private final String SERVER_URL = "http://localhost";

    @LocalServerPort
    private int port;
    private final RestTemplate restTemplate = new RestTemplate();

    private int statusCode;

    private String applyEndpoint(@NonNull final String endpoint) {
        return SERVER_URL + ":" + port + endpoint;
    }

    public int put(final String something, @NonNull final String endpoint) {
        return restTemplate.postForEntity(applyEndpoint(endpoint), something, Void.class).getStatusCode().value();
    }

    public String getContents(@NonNull final String endpoint) {
        return restTemplate.getForEntity(applyEndpoint(endpoint), String.class).getBody();
    }
    public HttpStatusCode getResponseCode(@NonNull final String endpoint) {
        return restTemplate.getForEntity(applyEndpoint(endpoint), String.class).getStatusCode();
    }

    public void clean(@NonNull final String endpoint) {
        restTemplate.delete(applyEndpoint(endpoint));
    }
}