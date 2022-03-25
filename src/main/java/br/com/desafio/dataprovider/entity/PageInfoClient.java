package br.com.desafio.dataprovider.entity;

import java.util.List;

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
public class PageInfoClient {
	private Long page;
	private Long pages;
	private String per_page;
	private Long total;
}
