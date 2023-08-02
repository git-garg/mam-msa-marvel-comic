package com.pichincha.mambu.marvel.comic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;

@RestController
@RequestMapping("/api/v1")
@lombok.AllArgsConstructor
public class CharacterController {

    private CharacterService characterService;

    @GetMapping("/characters/")
    List<CharacterDto> characters() {
        return characterService.getCharacterDto();
    }
}
