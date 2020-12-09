package restApiTestScripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteMethod {

	@Test
	public void DeleteDemo() {
		RequestSpecification request = new RestAssured().given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("", "");
		request.body(json.toJSONString());
		Response resp = request.delete("https://petstore.swagger.io/v2/pet/");
		System.out.println(resp.getStatusCode());
	}
}
