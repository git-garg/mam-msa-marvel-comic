package com.pichincha.mambu.marvel.comic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mambu.marvel.comic.service.MarvelService;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;

@RestController
@RequestMapping("/api/v1")
@lombok.AllArgsConstructor
public class MarvelController {

	private MarvelService marvelService;

	@GetMapping("/marvel")
	public MarvelDto getMarvelInfo() {
		return marvelService.getMarvelDto();
	}

}
