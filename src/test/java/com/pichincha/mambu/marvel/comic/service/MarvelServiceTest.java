package com.pichincha.mambu.marvel.comic.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelInfoDto;
import com.pichincha.mambu.marvel.comic.service.impl.MarvelServiceImpl;
import com.pichincha.mambu.marvel.comic.util.Util;

@SpringBootTest
public class MarvelServiceTest {

	@Mock
	private MarvelRepository marvelRepository;

	@InjectMocks
	private MarvelServiceImpl marvelServiceImpl;

	private MarvelInfoDto marvelInfoDto;

	@BeforeEach
	void init() {

		marvelInfoDto = new MarvelInfoDto();
		marvelInfoDto.setCode(200L);
		marvelInfoDto.setStatus("Ok");
		marvelInfoDto.setCopyright("© 2023 MARVEL");
		marvelInfoDto.setAttributionText("Data provided by Marvel. © 2023 MARVEL");
		marvelInfoDto
				.setAttributionHTML("<a href=\\\"http://marvel.com\\\">Data provided by Marvel. © 2023 MARVEL</a>");
		marvelInfoDto.setEtag("3ebecd8b84beef54ade110d2cd9a37b05510cccc");

	}

	@Test
	@DisplayName("get Marvel Info test")
	void getMarvelInfoTest() {

		String publicKey = "abcd";
		String privateKey = "1234";
		Long timestamp = 10L;

		String key = String.valueOf(timestamp).concat(privateKey).concat(publicKey);
		String hash = Util.getHashValue(key);

		assertEquals("622aacb51f0edc2ea01b6e944dbf3401", hash);

		when(marvelRepository.getResponseMarvelInfo(10L, publicKey, hash)).thenReturn(marvelInfoDto);

		assertEquals(200L, marvelServiceImpl.getMarvelInfoDto(10L, privateKey, publicKey).getCode());

	}
}
