package com.pichincha.mambu.marvel.comic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pichincha.mambu.marvel.comic.repository.ComicRepository;
import com.pichincha.mambu.marvel.comic.service.ComicService;
import com.pichincha.mambu.marvel.comic.service.dto.ComicDto;
import com.pichincha.mambu.marvel.comic.util.Util;

@Service
@lombok.AllArgsConstructor
public class ComicServiceImpl implements ComicService {

	private ComicRepository comicRepository;

	@Override
	public List<ComicDto> getComics(Long id, Long timestamp, String privateKey, String publicKey) {
		String hash = Util.getHashValue(String.valueOf(timestamp).concat(privateKey).concat(publicKey));
		return comicRepository.getResponseComicInfo(id, timestamp, publicKey, hash).getData().getResults();
	}

}
