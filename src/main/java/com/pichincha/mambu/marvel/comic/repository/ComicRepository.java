package com.pichincha.mambu.marvel.comic.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.pichincha.mambu.marvel.comic.service.dto.ComicInfoDto;

@FeignClient(name = "comic-client", url = "http://gateway.marvel.com/v1/public")
public interface ComicRepository {

	@GetMapping(value = "/characters/{id}/comics", consumes = MediaType.APPLICATION_JSON_VALUE)
	ComicInfoDto getResponseComicInfo(@PathVariable Long id, @RequestParam("ts") Long ts, @RequestParam("apikey") String apikey,
			@RequestParam("hash") String hash);

}
