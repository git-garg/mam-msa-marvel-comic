package com.pichincha.mambu.marvel.comic.repository;

import java.util.List;

import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;

public interface CharacterRespository {

	List<CharacterDto> getCaracters();

}
