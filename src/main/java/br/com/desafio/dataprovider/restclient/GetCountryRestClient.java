package br.com.desafio.dataprovider.restclient;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey="worldbank-api")
@Consumes(MediaType.APPLICATION_JSON)
public interface GetCountryRestClient {

	@GET
	String getCountryList(@QueryParam("format") String format);

	@GET
    @Path("/{country}/indicator/SI.POV.DDAY")
	String getInfoCountry(@PathParam("country") String country, @QueryParam("format") String format);
}
