package br.com.desire.ProjetoDemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Path("soma/{a}/{b}/{c}") 
    @Produces(MediaType.TEXT_PLAIN)
     public float soma(@PathParam("a") float a ,
    		 @PathParam("b") float b , @PathParam("c") float c) {
        return a+b+c;
    }
}
