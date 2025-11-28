package com.ansibytecode.Sample;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_RA {
    public static void main(String[] args) {

        //Gherkins Syntax -
        //Given() - Pre request - URL, headers,auth, body
        //When() - HTTP Method ? - GET/PUT/POST/DELETE..
        //Then()- Validations - 200 ok , firstname == pramod

        //full url - https://api.zippopotam.us/IN/483501
        //Base url - https://api.zippopotam.us
        //Base Path - /IN/483501

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the pincode");
        String pincode = scanner.next();

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}
