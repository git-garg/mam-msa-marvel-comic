package com.pichincha.mambu.marvel.comic.repository.impl;

import com.pichincha.mambu.marvel.comic.repository.CharacterRepository;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CharacterRepositoryImpl implements CharacterRepository {
    @Override
    public List<CharacterDto> characters() {
        List<CharacterDto> characters = Arrays.asList(CharacterDto.builder().id(1l).name("Spider Man").
                description("Spider Man").build());
        return characters;
    }
}
