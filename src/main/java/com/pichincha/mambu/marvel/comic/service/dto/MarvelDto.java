package com.pichincha.mambu.marvel.comic.service.dto;

@lombok.Getter
@lombok.Setter
public class MarvelDto {

	Long code;
	String status;
	String copyright;
	String attributionText;
	String attributionHTML;
	String etag;

	DataDto data;

}
