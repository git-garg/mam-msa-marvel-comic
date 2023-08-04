package com.pichincha.mambu.marvel.comic.util;

import org.apache.commons.codec.digest.DigestUtils;

public class Util {

	public static String getHashValue(String key) {
		return DigestUtils.md5Hex(key);
	}

}
