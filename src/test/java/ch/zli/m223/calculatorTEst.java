package ch.zli.m223;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class calculatorTEst {
  
  @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/calculator/add/15/19")
          .then()
             .statusCode(200)
             .body(is("34"));
    }
}
