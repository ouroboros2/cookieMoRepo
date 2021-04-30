package com.java.web.cookieMo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.web.cookieMo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);
}
