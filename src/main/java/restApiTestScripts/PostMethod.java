package restApiTestScripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	@Test
	public void PostMethodDemo() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("name", "sonu");
		json.put("job", "Lead");
		request.body(json.toJSONString());
		Response resp = request.post("https://reqres.in/api/users");
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getContentType());
	}
}
