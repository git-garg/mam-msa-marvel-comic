package com.pichincha.mambu.marvel.comic.repository;

import com.pichincha.mambu.marvel.comic.service.dto.MarvelDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "marvel-comics-client",
        url = "http://gateway.marvel.com/v1/public"
)
public interface MarvelRepository {
    @GetMapping(value = "/characters?ts=1&apikey=7ffa3acbf352e1ee03faba5489f6ab76&hash=4759a06cfe6e200b538d3ef55aabd85f"
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    MarvelDto getResponseMarvel();

}
