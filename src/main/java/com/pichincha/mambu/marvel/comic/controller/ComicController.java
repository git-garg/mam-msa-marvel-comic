package com.pichincha.mambu.marvel.comic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.mambu.marvel.comic.service.ComicService;
import com.pichincha.mambu.marvel.comic.service.dto.ComicDto;

@RestController
@RequestMapping
@lombok.AllArgsConstructor
public class ComicController {

	private ComicService comicService;

	@GetMapping("/comics/{id}")
	public List<ComicDto> getComicsByCharacterId(@PathVariable Long id) {
		Long timestamp = System.currentTimeMillis();
		String privateKey = "46856bb8271413a4b5dfa2cc62e986927310fb52";
		String publicKey = "7ffa3acbf352e1ee03faba5489f6ab76";
		return comicService.getComics(id, timestamp, privateKey, publicKey);
	}

}
