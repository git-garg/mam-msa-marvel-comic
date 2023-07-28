package com.pichincha.mambu.marvel.comic.repository.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pichincha.mambu.marvel.comic.repository.CharacterRespository;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;

@Service
public class CharacterRespositoryImpl implements CharacterRespository {

	@Override
	public List<CharacterDto> getCaracters() {
		return null;
	}

}
