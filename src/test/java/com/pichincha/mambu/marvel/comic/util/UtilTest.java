package com.pichincha.mambu.marvel.comic.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UtilTest {

	@Test
	void getHashTest() {
		String timestamp = "10";
		String publicKey = "abcd";
		String privateKey = "1234";
		String hash = Util.getHashValue(timestamp.concat(privateKey).concat(publicKey));
		assertEquals("622aacb51f0edc2ea01b6e944dbf3401", hash);
	}

}
