package demoTests;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiDemoDeleteTest {

	@Test
	public void apiDeleteTest() {

		RestAssured.baseURI = "https://rahulshettyacademy.com/";

		String bookId = "bcdsdfd2926674";

		String requestBody = "{\n" + "  \"ID\" : \"" + bookId + "\"\n" + "}";

		Response res = given().contentType(ContentType.JSON).body(requestBody).when().delete("/Library/DeleteBook.php")
				.then().extract().response();

		System.out.println("Response:\n" + res.asPrettyString());
		assertEquals(res.statusCode(), 200);

	}
}
