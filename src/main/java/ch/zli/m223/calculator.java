package ch.zli.m223;

import jakarta.enterprise.inject.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class calculator {

      @GET
      @Path("/add/{n1}/{n2}")
      public int result(@PathParam("n1") int n1, @PathParam("n2") int n2) {
        return n1 + n2;
      }
}