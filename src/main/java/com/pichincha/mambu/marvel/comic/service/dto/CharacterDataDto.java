package com.pichincha.mambu.marvel.comic.service.dto;

import java.util.List;

@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class CharacterDataDto extends BaseDataDto {
	List<CharacterDto> results;
}
