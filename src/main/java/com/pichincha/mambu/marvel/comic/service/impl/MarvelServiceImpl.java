package com.pichincha.mambu.marvel.comic.service.impl;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.MarvelService;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import org.springframework.stereotype.Service;

@Service
@lombok.AllArgsConstructor
public class MarvelServiceImpl implements MarvelService {

    private MarvelRepository marvelRepository;

    @Override
    public MarvelDto getMarvelDto() {
        return marvelRepository.getResponseMarvel().getBody();
    }
}
