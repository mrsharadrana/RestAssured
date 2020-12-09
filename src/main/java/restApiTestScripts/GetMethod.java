
package restApiTestScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod {

	@Test
	public void GetAPIDemo() {
		
	Response resp =	RestAssured.get("https://fakerestapi.azurewebsites.net/api/v1/Activities");
	
	System.out.println(resp.getStatusCode());
	Assert.assertEquals(resp.statusCode(), 200);
	}
}
