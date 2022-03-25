package br.com.desafio.core.usecase;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.desafio.core.domain.Country;
import br.com.desafio.core.gateway.CountryGateway;

@ApplicationScoped
public class GetCountriesUseCase {

    @Inject
    CountryGateway countryGateway;

    public String execute(){
          return countryGateway.getCountries();
    }
}