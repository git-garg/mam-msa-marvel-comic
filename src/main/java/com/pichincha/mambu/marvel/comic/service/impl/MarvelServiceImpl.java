package com.pichincha.mambu.marvel.comic.service.impl;

import org.springframework.stereotype.Service;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.MarvelService;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelInfoDto;
import com.pichincha.mambu.marvel.comic.util.Util;

@Service
@lombok.AllArgsConstructor
public class MarvelServiceImpl implements MarvelService {

	private MarvelRepository marvelRepository;

	@Override
	public MarvelInfoDto getMarvelInfoDto(Long timestamp, String privateKey, String publicKey) {
		String hast = Util.getHashValue(String.valueOf(timestamp).concat(privateKey).concat(publicKey));
		return marvelRepository.getResponseMarvelInfo(timestamp, publicKey, hast);
	}

}
