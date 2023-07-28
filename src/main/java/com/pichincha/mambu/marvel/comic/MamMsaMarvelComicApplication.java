package com.pichincha.mambu.marvel.comic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MamMsaMarvelComicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MamMsaMarvelComicApplication.class, args);
	}

}
