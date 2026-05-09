import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Basics {

	public static void main(String[] args) {
		
		//RestAssured uses 3 principles: 
		// 1. Given : All input details [queryparams, header& body will write here]
		// 2. When : Submit the API [resource & HTTP method will be here]
		// 3. Then : validate the response
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		
		given().log().all().queryParam("Key", "qaclick123").header("Content-Type","application/json")
			.body("{\r\n"
					+ "  \"location\": {\r\n"
					+ "    \"lat\": -38.383494,\r\n"
					+ "    \"lng\": 33.427362\r\n"
					+ "  },\r\n"
					+ "  \"accuracy\": 50,\r\n"
					+ "  \"name\": \"RSA_Mahaa12\",\r\n"
					+ "  \"phone_number\": \"(+91) 666 222 1234\",\r\n"
					+ "  \"address\": \"1, side layout, cohen 09\",\r\n"
					+ "  \"types\": [\r\n"
					+ "    \"shoe park\",\r\n"
					+ "    \"shop\"\r\n"
					+ "  ],\r\n"
					+ "  \"website\": \"https://rahulshettyacademy.com/\",\r\n"
					+ "  \"language\": \"English-IN\"\r\n"
					+ "}\r\n"
					+ "").when().post("/maps/api/place/add/json")
			.then().log().all().assertThat().statusCode(200);

	}

}
