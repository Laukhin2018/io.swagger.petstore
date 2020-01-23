package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.Argument;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class TestPet {


    @Test
    public void part1Test1(){
       given().contentType(ContentType.JSON).when().get("https://www.wiley.com/en-us/search/autocomplete/comp_00001H9J?term=Java")
                .then()
                .statusCode(200);


    }

    @Test
    public void part1Test2(){

        String baseUri = "https://www.wiley.com";
        String basePath = "/en-us/search/autocomplete/comp_00001H9J";




        given().baseUri(baseUri)
                .basePath(basePath)
                .queryParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()

                .get()
                .then()
                .statusCode(200)
                .extract().response().prettyPrint();
    }

    @Test
    public void part1Test3(){

        String baseUri = "https://www.wiley.com";
        String basePath = "/en-us/search/autocomplete/comp_00001H9J";


        given().baseUri(baseUri)
                .basePath(basePath)
                .queryParam("term" , "Java")
                .contentType(ContentType.JSON)
                .when()

                .get()
                .then()
                .body(containsString("<span class=\\\"search-highlight\\\">java</span> "));
    }


}
