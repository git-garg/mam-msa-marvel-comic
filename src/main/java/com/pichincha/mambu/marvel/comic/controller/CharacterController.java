package com.pichincha.mambu.marvel.comic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mambu.marvel.comic.service.CharacterService;
import com.pichincha.mambu.marvel.comic.service.dto.CharacterDto;

@RestController
@RequestMapping
@lombok.AllArgsConstructor
public class CharacterController {

	private CharacterService characterService;

	@GetMapping("/characters/")
	List<CharacterDto> characters() {
		Long timestamp = System.currentTimeMillis();
		String privateKey = "46856bb8271413a4b5dfa2cc62e986927310fb52";
		String publicKey = "7ffa3acbf352e1ee03faba5489f6ab76";
		return characterService.getCharacterDto(timestamp, privateKey, publicKey);
	}
}
