package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


import io.restassured.response.Response;

public class getdata {
	
	@Test
	
	public void testResponcecode()
	
	
	{
		when().
	       get("https://api.tmsandbox.co.nz/v1/Categories/6328/Details.json?catalogue=false").
	then().
	
	body("Name",equalTo("Badges"));
		
	}
	
			
		@Test
		
		public void testcanListClassifieds()
		{
			when().get("https://api.tmsandbox.co.nz/v1/Categories/6328/Details.json?catalogue=false").
			then().body("CanListClassifieds",equalTo(false));
		}
				
				@Test
				
				public void containsText()
				{
					
					
					when().
					get("https://api.tmsandbox.co.nz/v1/Categories/6328/Details.json?catalogue=false").
					
					then().statusCode(200).body("Charities.find { it.Description == 'Plunket' }.Tagline",containsString("well child health services"));
							
						}


			}
			
		
		

		
		
		
		
	
	