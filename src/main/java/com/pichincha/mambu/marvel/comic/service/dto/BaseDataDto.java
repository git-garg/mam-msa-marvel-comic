package com.pichincha.mambu.marvel.comic.service.dto;

@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class BaseDataDto {

	Long offset;
	Long limit;
	Long total;
	Long count;

}
