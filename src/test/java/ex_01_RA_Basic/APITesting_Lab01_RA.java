package ex_01_RA_Basic;


import io.restassured.RestAssured;

// this is traditional method or traditional BDD style
public class APITesting_Lab01_RA {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .log().all().get()
                .then().log().all().statusCode(201);
    }

}
