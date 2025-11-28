package ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab05_Multiple_TestCases {
    public static void main(String[] args) {

        String pincode = "483501";
           RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                    .basePath("/in/483501")                     //to give default pincode
                    .when()
                       .log()
                        .all()
                         .get()
                    .then().log().all().statusCode(200);

        pincode = "@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/483501")                     //to give default pincode
                .when()
                .log()
                .all()
                .get()
                .then().log().all().statusCode(200);


         pincode = " ";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/483501")                     //to give default pincode
                .when()
                .log()
                .all()
                .get()
                .then().log().all().statusCode(200);
    }
}
