package com.java.web.cookieMo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.web.cookieMo.model.Cookie;

public interface CookieRepository extends JpaRepository<Cookie, Integer> {

}
