package demoTests;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiDemoGetTest {

	@Test
	public void apiGetTest() {

		RestAssured.baseURI = "https://rahulshettyacademy.com/";

		String bookId = "bcdsdfd2926674";

		Response res = given().queryParam("ID", bookId).when().get("/Library/GetBook.php").then().extract().response();

		System.out.println("Response:\n" + res.asPrettyString());
		assertEquals(res.statusCode(), 200);

	}

}
