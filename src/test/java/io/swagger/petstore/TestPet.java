package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestPet {


    @Test
    public void part1Test1(){
        given().contentType(ContentType.JSON).when().get("https://www.wiley.com/en-us/search/autocomplete/comp_00001H9J?term=Java")
                .then()
                .extract().response().prettyPrint();
    }

    @Test
    public void part1Test2(){
        given().baseUri("https://www.wiley.com")
                .basePath("/en-us/search/autocomplete/comp_00001H9J")
                .contentType(ContentType.JSON)
                .when()
                .queryParam("term" , "Java")
                .get()
                .then()
                .extract().response().prettyPrint();
    }


}
