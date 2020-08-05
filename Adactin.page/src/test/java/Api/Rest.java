package Api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Rest{
	@Test
	public void testCase() {
		JSONObject object=new JSONObject();
		object.put("name","gopal");
		object.put("result","fail");
		given().contentType(ContentType.JSON).accept(ContentType.JSON)
		.header("Content-Type","application/json")
		.body(object.toJSONString())
		.when().post("http://localhost:3000/pass")
		.then().statusCode(201).log().all();
	}
}

