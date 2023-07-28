package com.pichincha.mambu.marvel.comic.service.impl;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.MarvelService;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@lombok.AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private MarvelService marvelService;


    @Override
    public List<CharacterDto> getCharacterDto() {
        return marvelService.getMarvelDto().getData().getResults();
    }
}
