package ex_01_RA_Basic;
import io.restassured.RestAssured;
import java.util.Scanner;


// this BDD style  or traditional pattern

public class APITesting_Lab02_RA {
    public static void main(String[] args) {

        //Gerkin Syntax:
        //Given() -> Pre quest - url, header,auth, body
        //when () -> HTTP method ? - get, put, post, delete
        //Then() -> validation - 200 ok, firstnmae = pramod


        // full url : https://api.zippopotam.us/in/483501
        //base uri : https://api.zippopotam.us
        //base path : /in/483501

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode!");
        String pincode = sc.next();


        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
          //      .basePath("/in/483501")                     //to give default pincode
                .basePath("/IN/" + pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);

    }
}
