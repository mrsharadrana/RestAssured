package bestBuyAPITestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetProduct {

	private String strBaseURI = "http://localhost:3030/";
	private String strServicePath = "products";
	private String strURI = strBaseURI+strServicePath;
	@Test
	public void RetrieveProducts() {
//		Response resp = RestAssured.get(strURI);
//		System.out.println("URI is "+strURI);
//		System.out.println("Status Code is " + resp.getStatusCode());
//		System.out.println("Response Body is " + resp.getBody().asString());
		RestAssured.baseURI = strBaseURI;
		RequestSpecification request = RestAssured.given();
		Response response = request.queryParam("$limit", "1")
				.get(strServicePath);
		String jsonString = response.asPrettyString();
		System.out.println(jsonString);
	}
}
