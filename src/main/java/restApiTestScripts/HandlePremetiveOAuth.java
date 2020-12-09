package restApiTestScripts;

import io.restassured.RestAssured;

public class HandlePremetiveOAuth {

	
	
	
	public void PremetiveOAuthDemo() {
		
		
	int StatusCode = RestAssured.given()
					.auth()
					.preemptive()
					.basic("username", "password")
					.when()
					.get("URL")
					.statusCode();
				System.out.println("StatusCode "+StatusCode);
	}
}
