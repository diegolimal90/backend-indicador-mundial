package br.com.desafio.dataprovider.mapper;

import java.util.Optional;

import br.com.desafio.core.domain.Country;
import br.com.desafio.dataprovider.entity.CountryClient;
import br.com.desafio.dataprovider.entity.ValuesClient;

public class CountryClientMapper {
    public static CountryClient to(Country domain){
        return Optional.ofNullable(domain).map(mapper -> CountryClient.builder()
                .id(mapper.getId())
                .iso2Code(mapper.getCode())
                .name(mapper.getCode())
                .region(new ValuesClient())
                .adminregion(new ValuesClient())
                .incomeLevel(new ValuesClient())
                .lendingType(new ValuesClient())
                .capitalCity(mapper.getCapital())
                .longitude(mapper.getLongitude())
                .latitude(mapper.getLongitude())
            .build())
            .orElse(CountryClient.builder().build());
    }

    public static Country from(CountryClient client){
        return Optional.ofNullable(client).map(mapper -> Country.builder()
        		.id(mapper.getId())
                .code(mapper.getIso2Code())
                .capital(mapper.getCapitalCity())
                .longitude(mapper.getLongitude())
                .latitude(mapper.getLongitude())
            .build())
            .orElse(Country.builder().build());
    }
}