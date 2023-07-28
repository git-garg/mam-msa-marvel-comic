package com.pichincha.mambu.marvel.comic.service.dto;

import lombok.AccessLevel;

import java.util.List;

@lombok.Builder
@lombok.Getter
@lombok.Setter
@lombok.experimental.FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MarvelDto {

    Long code;
    String status;
    String copyright;
    String attributionText;
    String attributionHTML;
    String etag;

    DataDto data;

}
