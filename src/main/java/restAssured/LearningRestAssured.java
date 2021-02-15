package restAssured;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static org.hamcrest.Matchers.*;

import org.asynchttpclient.request.body.Body;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.*;

public class LearningRestAssured {

	//@Test
	public void rsGet() {
		
		//Verify Status Code
		int statusCode = get("https://reqres.in/api/users?page=2").statusCode();
		System.out.println(statusCode);
		
		//ContenType
		given().contentType(ContentType.JSON).accept(ContentType.JSON).
		when().get("https://www.facebook.com/").
		then().statusCode(200);
		
		//body
		given().get("https://reqres.in/api/unknown").
		then().statusCode(200).
		body("data.id[1]", equalTo(2)).
		body("data.name", hasItems("cerulean","tigerlily")).
		body("data.year",hasItems(2000,2001,2004,2005));
	
		}
	
	@Test
	public void rsPost() {
		
		JSONObject post = new JSONObject();
		post.put("name", "Mahesh");
		post.put("job", "TeamLead");
		
		given().body(post.toJSONString()).
		when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}
}
