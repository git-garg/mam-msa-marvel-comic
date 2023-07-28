package com.pichincha.mambu.marvel.comic.service;


import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import com.pichincha.mambu.marvel.comic.service.impl.CharacterServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

@SpringBootTest
class CharacterServiceImplTest {

    @Mock
    private MarvelRepository marvelRepository;

    @InjectMocks
    private CharacterServiceImpl characterServiceImpl;

    private MarvelDto marvelDto;

    @BeforeEach
    void init() {
        marvelDto = MarvelDto.builder().code(200L).status("Ok").copyright("© 2023 MARVEL").
                attributionText("Data provided by Marvel. © 2023 MARVEL").
                attributionHTML("<a href=\\\"http://marvel.com\\\">Data provided by Marvel. © 2023 MARVEL</a>").
                etag("3ebecd8b84beef54ade110d2cd9a37b05510cccc").build();
    }

    @Test
    @DisplayName("get Marvel Info test")
    void getMarvelInfoTest() {
        when(marvelRepository.getResponseMarvel()).thenReturn(getResponseEntity());
        Assertions.assertNotNull(characterServiceImpl.getMarvelDto());
        Assertions.assertEquals(200, characterServiceImpl.getMarvelDto().getCode());

    }

    private ResponseEntity<MarvelDto> getResponseEntity() {
        return new ResponseEntity<>(marvelDto, HttpStatus.OK);
    }

}
