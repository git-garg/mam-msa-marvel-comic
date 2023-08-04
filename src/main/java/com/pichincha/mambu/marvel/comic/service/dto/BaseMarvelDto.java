package com.pichincha.mambu.marvel.comic.service.dto;

@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class BaseMarvelDto {

	Long code;
	String status;
	String copyright;
	String attributionText;
	String attributionHTML;
	String etag;

}
