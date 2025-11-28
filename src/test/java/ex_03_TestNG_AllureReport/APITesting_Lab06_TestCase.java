package ex_03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {

    String pincode ;


    @Test
    //483501
    public void TC01_pincode_valid() {
        pincode = "483501";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" +pincode)                     //to give default pincode
                .when()
                .log()
                .all()
                .get()
                .then().log().all().statusCode(200);


    }

    @Test
//#,$,%,@- any special symbol in pincode
    public void TC02_pincode_invalid() {
        pincode = "@";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" +pincode)                     //to give default pincode
                .when()
                .log()
                .all()
                .get()
                .then().log().all().statusCode(200);

    }

    @Test
    // " " blank or space
    public void TC03_pincode_invalid() {

        pincode = " ";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + " ")                     //to give default pincode
                .when()
                .log()
                .all()
                .get()
                .then().log().all().statusCode(200);
    }


}
