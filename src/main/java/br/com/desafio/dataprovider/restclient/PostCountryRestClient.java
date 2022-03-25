package br.com.desafio.dataprovider.restclient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

//@Path("/")
//@RegisterRestClient(configKey="worldbank-api")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
//public interface PostCountryRestClient {
//
//	@POST
//    @Path("{country}/indicator/SI.POV.DDAY?format=json")
//	String getInfoCountry(@PathParam("country") String country);
//
//}
