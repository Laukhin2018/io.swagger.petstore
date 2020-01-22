package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class TestPet {

    @Test
    public void petTest(){
        RestAssured.given()
                .baseUri("https://www.wiley.com")
                .basePath("/en-us/search/autocomplete/comp_00001H9J")
                .contentType(ContentType.JSON)
                .header("term", "Java")
                .when().get()
                .then()
                .extract().response().prettyPrint();
    }


}
