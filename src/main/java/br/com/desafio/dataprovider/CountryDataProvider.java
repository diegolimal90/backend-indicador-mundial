package br.com.desafio.dataprovider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.params.HttpParams;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.desafio.core.gateway.CountryGateway;
import br.com.desafio.dataprovider.restclient.GetCountryRestClient;

@ApplicationScoped
public class CountryDataProvider implements CountryGateway{
	@Inject
    @RestClient
    GetCountryRestClient getCountryRestClient;

//    @Inject
//    @RestClient
//    PostCountryRestClient postCountryRestClient;
    
    private static String FORMAT = "json";

    @Override
    public String getCountries(){

    	String responseClient = getCountryRestClient.getCountryList(FORMAT);
    	
//    	TODO - Revisar com atencao pq nao estao sendo feito o parse do retorno com o object
//    	List<ResponseCountryClient> responseList = countryRestClient.getCountryList(FORMAT);
//    	
//        List<CountryClient> countryList = new ArrayList<>();
//        for(ResponseCountryClient response: responseList) {
//        	countryList.addAll(response.getCountryClientList());
//        }
    	
    	return responseClient;
    }

	@Override
	public String getInfoCountry(String country) {
		String responseClient = getCountryRestClient.getInfoCountry(country, FORMAT);
    	
//    	TODO - Revisar com atencao pq nao estao sendo feito o parse do retorno com o object
//    	List<ResponseCountryClient> responseList = countryRestClient.getInfoCountry(country, FORMAT);
//    	
//        List<CountryClient> countryList = new ArrayList<>();
//        for(ResponseCountryClient response: responseList) {
//        	countryList.addAll(response.getCountryClientList());
//        } 
            
        return responseClient;
	}
}