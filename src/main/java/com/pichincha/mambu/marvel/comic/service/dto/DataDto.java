package com.pichincha.mambu.marvel.comic.service.dto;

import lombok.AccessLevel;

import java.util.List;

@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DataDto {

    Long offset;
    Long limit;
    Long total;
    Long count;

    List<CharacterDto> results;
}
