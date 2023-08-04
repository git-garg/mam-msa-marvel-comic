package com.pichincha.mambu.marvel.comic.service;

import com.pichincha.mambu.marvel.comic.service.dto.MarvelInfoDto;

public interface MarvelService {

    MarvelInfoDto getMarvelInfoDto(Long timestamp, String privateKey, String publicKey);

}
