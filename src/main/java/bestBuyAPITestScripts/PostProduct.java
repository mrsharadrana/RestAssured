package bestBuyAPITestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostProduct {
	
	private String strBaseURI = "http://localhost:3030/";
	private String strServicePath = "products";
	private String jsonBody = "{\"name\":\"New Product\",\"type\":\"Hard Good\",\"upc\":\"12345676\",\"price\":99.99,\"description\":\"This is a placeholder request for creating a new product.\",\"model\":\"NP12345\"}";
	@Test
	public void CreateProduct() {
		System.out.println("Base URI"+strBaseURI);
		System.out.println("Json Request Body"+jsonBody);
		RestAssured.baseURI = strBaseURI;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.body(jsonBody)
				.post(strServicePath);
		System.out.println("Status Code "+response.getStatusCode());
		String jsonResponse = response.asPrettyString();
		System.out.println(jsonResponse);
	}

}
