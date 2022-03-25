package br.com.desafio.entrypoint.mapper;

import java.util.Optional;

import br.com.desafio.core.domain.Country;
import br.com.desafio.entrypoint.entity.CountryHttpModel;

public class CountryHttpModelMapper {
	
    public static CountryHttpModel to(Country domain){
        return Optional.ofNullable(domain).map(mapper -> CountryHttpModel.builder()
                .codigo(mapper.getCode())
            	.nome(mapper.getName())
            .build())
            .orElse(CountryHttpModel.builder().build());
    }

    public static Country from(CountryHttpModel httpModel){
        return Optional.ofNullable(httpModel).map(mapper -> Country.builder()
        		.code(mapper.getCodigo())
            	.name(mapper.getNome())
                .build())
            .orElse(Country.builder().build());
    }
}