package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getdata2 {
	
	@Test
	
	public void testResponcecode()
	{
		
		Response resp=RestAssured.get("https://api.tmsandbox.co.nz/v1/Categories/6328/Details.json");
		
		int code=resp.getStatusCode();
		
		System.out.println("Status code is "+code);
		
		Assert.assertEquals(code, 200);
		
	}
	
	
	@Test
	
	public void testbody()
	
	{
	
		Response resp=RestAssured.get("https://api.tmsandbox.co.nz/v1/Categories/6328/Details.json");
		String data=resp.asString();
		System.out.println("Response time"+resp.getTime());
		
		

		
		
	}

}
