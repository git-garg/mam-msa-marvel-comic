package com.pichincha.mambu.marvel.comic.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pichincha.mambu.marvel.comic.service.dto.MarvelInfoDto;

@FeignClient(name = "marvel-client", url = "http://gateway.marvel.com/v1/public")
public interface MarvelRepository {

	@GetMapping(value = "/characters", consumes = MediaType.APPLICATION_JSON_VALUE)
	MarvelInfoDto getResponseMarvelInfo(@RequestParam("ts") Long ts, @RequestParam("apikey") String apikey,
			@RequestParam("hash") String hash);

}
