package com.pichincha.mambu.marvel.comic.controller;

import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@lombok.RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/character/")
    ResponseEntity<List<CharacterDto>> characters() {
        List<CharacterDto> characterDtoList = characterService.characters();
        return new ResponseEntity<>(characterDtoList, HttpStatus.OK);
    }
}
