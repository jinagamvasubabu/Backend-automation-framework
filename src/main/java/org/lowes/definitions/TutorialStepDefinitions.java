package org.lowes.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.lowes.dto.Tutorial;

import org.springframework.http.HttpStatus;
import static org.assertj.core.api.Assertions.assertThat;
import io.cucumber.java.Before;
import io.restassured.response.Response;



@CucumberContextConfiguration
public class TutorialStepDefinitions {

  private static final String BASE_URL = "http://localhost:8080";
  private Response response;

  private String endpoint;
  private Tutorial tutorial;
  private HttpStatus responseStatus;

  @Before
  public void setup() {
    RestAssured.baseURI = BASE_URL;
  }

  @Given("^the API endpoint \"([^\"]*)\"$")
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  @When("^I make a GET request$")
  public void makeGetRequest() {
    String url = "http://localhost:8080"+this.endpoint;
    response = RestAssured.given()
            .get(url);
  }

  @Then("^the response status code should be (\\d+)$")
  public void validateStatusCode(int statusCode) {
    assertThat(response.statusCode()).isEqualTo(statusCode);
  }

  @Then("^the title should contain \"([^\"]*)\"$")
  public void validateResponseBody(String expectedField) {
    Assertions.assertEquals(response.jsonPath().getString("title"), expectedField);
  }
}
