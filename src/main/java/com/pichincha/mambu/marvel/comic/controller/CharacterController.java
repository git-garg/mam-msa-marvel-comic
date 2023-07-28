package com.pichincha.mambu.marvel.comic.controller;

import com.pichincha.mambu.marvel.comic.repository.MarvelRepository;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@lombok.AllArgsConstructor
public class CharacterController {

    private MarvelRepository marvelRepository;
    @GetMapping("/characters/")
    MarvelDto characters() {
        return marvelRepository.getResponseMarvel().getBody();
    }
}
