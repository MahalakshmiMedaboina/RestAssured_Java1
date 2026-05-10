import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class Basics {

	public static void main(String[] args) {
		
		//RestAssured uses 3 principles: 
		// 1. Given : All input details [queryparams, header& body will write here]
		// 2. When : Submit the API [resource & HTTP method will be here]
		// 3. Then : validate the response
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		given().log().all().queryParam("Key", "qaclick123").header("Content-Type","application/json")
			.body(payload.AddPlace()).when().post("/maps/api/place/add/json")
			.then().log().all().assertThat().statusCode(200)
			.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)");

	}

}
