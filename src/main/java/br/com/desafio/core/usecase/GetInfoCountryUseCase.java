package br.com.desafio.core.usecase;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.desafio.core.gateway.CountryGateway;

@ApplicationScoped
public class GetInfoCountryUseCase {

    @Inject
    CountryGateway countryGateway;

    public String execute(String country){
          return countryGateway.getInfoCountry(country);
    }
}