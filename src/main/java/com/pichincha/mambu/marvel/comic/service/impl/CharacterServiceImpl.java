package com.pichincha.mambu.marvel.comic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.MarvelService;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;

@Service
@lombok.AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {

	private MarvelService marvelService;

	@Override
	public List<CharacterDto> getCharacterDto(Long timestamp, String privateKey, String publicKey) {
		return marvelService.getMarvelInfoDto(timestamp, privateKey, publicKey).getData().getResults();
	}
}
