package com.pichincha.mambu.marvel.comic.service;

import java.util.List;

import com.pichincha.mambu.marvel.comic.service.dto.ComicDto;

public interface ComicService {

	List<ComicDto> getComics(Long id, Long timestamp, String privateKey, String publicKey);

}
