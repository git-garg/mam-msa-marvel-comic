package com.pichincha.mambu.marvel.comic.service.dto;

import lombok.AccessLevel;

@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = AccessLevel.PRIVATE)
public class MarvelDto {

	Long code;
	String status;
	String copyright;
	String attributionText;
	String attributionHTML;
	String etag;

	DataDto data;

}
