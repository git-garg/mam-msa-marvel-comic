package com.pichincha.mambu.marvel.comic.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.pichincha.mambu.marvel.comic.repository.CharacterRespository;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import com.pichincha.mambu.marvel.comic.service.impl.CharacterServiceImpl;

public class CharacterServiceImplTest {

	@InjectMocks
	private CharacterRespository characterRespository;

	@Mock
	private CharacterServiceImpl characterServiceImpl;

	@Test
	@DisplayName("all character test")
	public void getCharacterListTest() {

		List<CharacterDto> characters = new ArrayList<>();
		CharacterDto characterDto = new CharacterDto();
		//when(characterRespository.getCaracters()).thenReturn(characters);

	}

}
