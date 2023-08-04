package com.pichincha.mambu.marvel.comic.service.impl;

import org.springframework.stereotype.Service;

import com.pichincha.mambu.marvel.comic.service.ComicService;

@Service
@lombok.AllArgsConstructor
public class ComicServiceImpl implements ComicService {

	@Override
	public String getString(Long id) {
		return "Valor: " + id;
	}

//	private ComicRepository comicRepository;

//	@Override
//	public List<ComicDto> getCharacterDto(Long id, Long timestamp, String privateKey, String publicKey) {
//		ComicInfoDto comicInfoDto = comicRepository.getResponseComicInfo(id, timestamp, privateKey, publicKey);
//		return comicInfoDto.getData().getResults();
//	}

}
