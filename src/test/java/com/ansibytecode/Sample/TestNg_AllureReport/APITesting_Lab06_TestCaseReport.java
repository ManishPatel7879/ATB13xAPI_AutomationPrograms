package com.ansibytecode.Sample.TestNg_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCaseReport {
    String pincode;

    @Test
    // TC01 - Valid pincode should return 200
    public void test_tc1_pincode_valid() {
        pincode = "483501";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    // TC02 - Special characters - should return 404
    public void test_tc2_pincode_invalid_special_char() {
        pincode = "@";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(404);
    }

    @Test
    // TC03 - Blank pincode - should return 404
    public void test_tc3_pincode_invalid_blank() {
        pincode = "";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(404);
    }
}
