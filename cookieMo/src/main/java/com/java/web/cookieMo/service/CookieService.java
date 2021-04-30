package com.java.web.cookieMo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.web.cookieMo.model.Cookie;
import com.java.web.cookieMo.repository.CookieRepository;

@Service
public class CookieService {

	@Autowired
	CookieRepository cookieRepository;
	
	public Cookie saveCookie(Cookie cookie) {
		
		return cookieRepository.save(cookie);
		
	}
	
	public List<Cookie> getAllCookies() {
		return cookieRepository.findAll();
	}
	
}
