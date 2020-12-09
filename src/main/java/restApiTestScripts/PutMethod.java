package restApiTestScripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutMethod {
	
	@Test
	public void PutMethodDemo() {
		
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		JSONObject jsonBody = new JSONObject();
		jsonBody.put("name", "sharad");
		jsonBody.put("job", "QA");
		request.body(jsonBody.toJSONString());
		Response resp = request.put("https://reqres.in/api/users/2");
		System.out.println("Status Code "+resp.getStatusCode());
	}

}
