package com.pichincha.mambu.marvel.comic.service;

import java.util.List;

import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;

public interface CharacterService {

	List<CharacterDto> getCharacterDto(Long timestamp, String privateKey, String publicKey);
	
}
