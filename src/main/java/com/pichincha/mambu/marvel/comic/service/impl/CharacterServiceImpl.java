package com.pichincha.mambu.marvel.comic.service.impl;

import com.pichincha.mambu.marvel.comic.repository.CharacterRepository;
import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public List<CharacterDto> characters() {
        return characterRepository.characters();
    }
}
