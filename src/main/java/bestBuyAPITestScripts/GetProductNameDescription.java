package bestBuyAPITestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProductNameDescription {
	
	private String strBaseURI = "http://localhost:3030/";
	private String strServicePath = "products";
	
	@Test
	public void GetProductNameAndDescription() {
		RestAssured.baseURI = strBaseURI;
		RequestSpecification request = RestAssured.given();
		Response response = request.header("Content-Type", "application/json").queryParam("$select[]", "name").queryParam("$select[]", "description").get(strServicePath);
		System.out.println("Reponse is " +response.asPrettyString());
	}

}
