package demoTests;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APIDemoPostTest {

	@Test

	public void ApiPostTest() {
		RestAssured.baseURI = "https://rahulshettyacademy.com/";

		String requestBody = "{\n" + "  \"name\":\"Learn Appium Automation with Java Test\",\n"
				+ "  \"isbn\":\"bcdsdfd\",\n" + "  \"aisle\":\"2926674\",\n" + "  \"author\":\"John foer\"\n" + "}";

		Response res = given().contentType(ContentType.JSON).body(requestBody).when().post("/Library/Addbook.php")
				.then().extract().response();

		System.out.println("Response:\n" + res.asPrettyString());
		assertEquals(res.statusCode(), 200);

	}

}
