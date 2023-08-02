package com.pichincha.mambu.marvel.comic.service.dto;

import java.util.List;

import lombok.AccessLevel;

@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = AccessLevel.PRIVATE)
public class DataDto {

	Long offset;
	Long limit;
	Long total;
	Long count;

	List<CharacterDto> results;
}
