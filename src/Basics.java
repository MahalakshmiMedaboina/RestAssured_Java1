import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class Basics {

	public static void main(String[] args) {
		
		//RestAssured uses 3 principles: 
		// 1. Given : All input details [queryparams, header& body will write here]
		// 2. When : Submit the API [resource & HTTP method will be here]
		// 3. Then : validate the response
		
		// Validate the Add Place API is working fine or not	
		//Add place -> Update place with new address -> Get place to validate if new address is present in response
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
	String	Response = given().log().all().queryParam("Key", "qaclick123").header("Content-Type","application/json")
			.body(payload.AddPlace()).when().post("/maps/api/place/add/json")
			.then().assertThat().statusCode(200)
			.body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
	System.out.println(Response);
	
	// from the above response we need to extract place_id to update and get place API
	
	JsonPath js = new JsonPath(Response); // for parsing Json will create an object of JsonPath class and pass the response to its constructor
	String place_id = js.getString("place_id"); 
	
	System.out.println(place_id);
	
	//update place API
	given().log().all().queryParam("Key","qaclick123").header("Content-Type","application/json")
	.body("{\r\n"
			+ "\"place_id\":\""+place_id+"\",\r\n"
			+ "\"address\":\"66 Summer walk, USA\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}") 
	.when().put("/maps/api/place/update/json")
	.then().assertThat().log().all().statusCode(200)
	.body("msg", equalTo("Address successfully updated"));
	
	}

}
