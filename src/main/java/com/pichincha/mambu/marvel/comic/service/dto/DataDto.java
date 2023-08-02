package com.pichincha.mambu.marvel.comic.service.dto;

import java.util.List;

@lombok.Getter
@lombok.Setter
public class DataDto {

	Long offset;
	Long limit;
	Long total;
	Long count;

	List<CharacterDto> results;
}
