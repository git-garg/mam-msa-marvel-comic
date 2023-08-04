package com.pichincha.mambu.marvel.comic.service.dto;

@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ComicInfoDto extends BaseMarvelDto {
	ComicDataDto data;
}
