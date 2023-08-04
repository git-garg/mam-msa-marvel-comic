package com.pichincha.mambu.marvel.comic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mambu.marvel.comic.service.MarvelService;
import com.pichincha.mambu.marvel.comic.service.dto.MarvelInfoDto;

@RestController
@RequestMapping
@lombok.AllArgsConstructor
public class MarvelController {

	private MarvelService marvelService;

	@GetMapping("/marvel/")
	public MarvelInfoDto getMarvelInfo() {
		Long timestamp = System.currentTimeMillis();
		String privateKey = "46856bb8271413a4b5dfa2cc62e986927310fb52";
		String publicKey = "7ffa3acbf352e1ee03faba5489f6ab76";
		return marvelService.getMarvelInfoDto(timestamp, privateKey, publicKey);
	}

}
