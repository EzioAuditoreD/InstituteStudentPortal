package com.isp.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class IspUtils {
	public static PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
}
