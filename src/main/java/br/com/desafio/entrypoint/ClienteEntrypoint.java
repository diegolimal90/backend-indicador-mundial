package br.com.desafio.entrypoint;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.desafio.core.usecase.GetCountriesUseCase;
import br.com.desafio.core.usecase.GetInfoCountryUseCase;

@Path("/paises")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class ClienteEntrypoint {
    
    @Inject
    GetCountriesUseCase getCountriesUseCase;

    @Inject
    GetInfoCountryUseCase getInfoCountryUseCase;

    @GET
    public String getCountries(){
        String domain = getCountriesUseCase.execute();
                    
        return domain;
    } 
    
    @POST
    @Path("/{pais}")
    public String getDataCountry(@PathParam("pais") String pais){
        String domain = getInfoCountryUseCase.execute(pais); 
        return domain;
    }
}