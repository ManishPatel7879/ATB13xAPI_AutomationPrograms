package com.ansibytecode.Sample;

import io.restassured.RestAssured;

public class APITesting_lab05_MultilpleTestCases_BP {
    public static void main(String[] args) {

        // this is called direct BDD style or BDD styel of buidler pattern. in this need to repeate the code and lengthy not using this style
        String pincode = "483501";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

         pincode = "@";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

         pincode = " ";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);



    }



}
