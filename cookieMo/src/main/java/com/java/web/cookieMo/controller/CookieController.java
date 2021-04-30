package com.java.web.cookieMo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.web.cookieMo.model.Cookie;
import com.java.web.cookieMo.model.User;
import com.java.web.cookieMo.service.CookieService;
import com.java.web.cookieMo.service.UserService;

@Controller
public class CookieController {

	@Autowired
	private UserService userService;
	@Autowired
	private CookieService cookieService;
	
	@RequestMapping("/adminHome")
	public ModelAndView displayLoginPage() {
		
		ModelAndView model = new ModelAndView("admin_login");
		//User validateUser = userService.validateUserAndPassword(user);
		model.addObject("user", new User());
		
		return model;
	}
	
	@RequestMapping("/Inventory")
	public ModelAndView displayInventoryPage() {
		
		ModelAndView modelAndView = new ModelAndView("admin_cookieInventory");
		
		return modelAndView;
	}
	
	@RequestMapping("/newCookie")
	public ModelAndView displayNewCookie(@ModelAttribute Cookie cookie) {
		ModelAndView model = new ModelAndView("admin_addCookie");
		model.addObject("cookie", new Cookie());
		return model;
	}
	
	@RequestMapping("/editCookie")
	public ModelAndView displayEditCookie() {
		
		ModelAndView model = new ModelAndView("admin_editCookie");
		
		return model;
	}
	
	@RequestMapping("/saveCookie")
	public ModelAndView saveCookie(@ModelAttribute Cookie cookie) {
		
		ModelAndView model = new ModelAndView("blank");
		Cookie newCookie = cookieService.saveCookie(cookie);
		model.addObject("cookie", newCookie);
		return model;
	}
	
	@RequestMapping("/validateAdmin")
	public ModelAndView validateAdmin(@ModelAttribute User user) {
		
		ModelAndView model = new ModelAndView("admin_editCookie");
		User validateUser = userService.validateUserAndPassword(user);
		model.addObject("user", validateUser);
		return model;
	}
}
