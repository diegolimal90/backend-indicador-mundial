package br.com.desafio.core.domain;

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
public class Country {
	private String id;
	private String code;
	private String name;
    private String capital;
    private String longitude;
    private String latitude;
}
