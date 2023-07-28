package com.pichincha.mambu.marvel.comic.service.impl;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import org.springframework.stereotype.Service;

@Service
@lombok.AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private MarvelRepository marvelRepository;

    @Override
    public MarvelDto getMarvelDto() {
        return marvelRepository.getResponseMarvel().getBody();
    }
}
