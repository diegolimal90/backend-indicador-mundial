package br.com.desafio.dataprovider.entity;

import javax.json.bind.annotation.JsonbProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryClient {
	@JsonbProperty("id")
    private String id;
	@JsonbProperty("iso2Code")
    private String iso2Code;
    private String name;
    private ValuesClient region;
    private ValuesClient adminregion;
    private ValuesClient incomeLevel;
    private ValuesClient lendingType;
    private String capitalCity;
    private String longitude;
    private String latitude;  
    
    private Long page;
	private Long pages;
	private String per_page;
	private Long total;
}
