package com.pichincha.mambu.marvel.comic.service;

import com.pichincha.mambu.marvel.comic.repository.CharacterRepository;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import com.pichincha.mambu.marvel.comic.service.impl.CharacterServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
public class CharacterServiceImplTest {

    @Mock
    private CharacterRepository characterRepository;

    @InjectMocks
    private CharacterServiceImpl characterServiceImpl;

    @Test
    @DisplayName("get all character test")
    public void getCharacterListTest() {

        List<CharacterDto> characters = new ArrayList<>();
        CharacterDto characterDto = CharacterDto.builder().id(1l).name("Spider Man").description("Spider Man").build();
        characters.add(characterDto);
        when(characterRepository.characters()).thenReturn(characters);
        Assertions.assertNotNull(characterServiceImpl.characters());

    }

}
