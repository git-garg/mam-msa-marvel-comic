package com.pichincha.mambu.marvel.comic.service;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import com.pichincha.mambu.marvel.comic.service.impl.MarvelServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@SpringBootTest
public class MarvelServiceTest {

	@Mock
	private MarvelRepository marvelRepository;

	@InjectMocks
	private MarvelServiceImpl marvelServiceImpl;

	private MarvelDto marvelDto;

	@BeforeEach
	void init() {

		marvelDto = new MarvelDto();
		marvelDto.setCode(200L);
		marvelDto.setStatus("Ok");
		marvelDto.setCopyright("© 2023 MARVEL");
		marvelDto.setAttributionText("Data provided by Marvel. © 2023 MARVEL");
		marvelDto.setAttributionHTML("<a href=\\\"http://marvel.com\\\">Data provided by Marvel. © 2023 MARVEL</a>");
		marvelDto.setEtag("3ebecd8b84beef54ade110d2cd9a37b05510cccc");

	}

	@Test
    @DisplayName("get Marvel Info test")
    void getMarvelInfoTest() {
        when(marvelRepository.getResponseMarvel()).thenReturn(getResponseEntity());
        Assertions.assertNotNull(marvelServiceImpl.getMarvelDto());
        Assertions.assertEquals(200, marvelServiceImpl.getMarvelDto().getCode());

    }

	private MarvelDto getResponseEntity() {
		return marvelDto;
	}
}
