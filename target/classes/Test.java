package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@SuppressWarnings("unused")
@Path("/test")
public class Test {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String SendTest()
	{
		String resourse = "{\"nome\": \"test\" }";
		
		return resourse;
	}
	
}