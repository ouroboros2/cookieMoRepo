package com.java.web.cookieMo.controller;

import java.util.List;

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
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CookieService cookieService;
	
	@RequestMapping("/")
	public ModelAndView displayLoginPage() {

		ModelAndView model = new ModelAndView("user_login");
		User user = new User();
		model.addObject("user", user);
		return model;	
	}
	
	
	@RequestMapping("/cookieMo")
	public ModelAndView DisplayStore() {
	
		ModelAndView model = new ModelAndView("user_store");
		User user = new User();
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/checkout")
	public ModelAndView Checkout() {
	
		ModelAndView model = new ModelAndView("user_checkout");
		User user = new User();
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/payment")
	public ModelAndView Payment() {
	
		ModelAndView model = new ModelAndView("user_payment");
		User user = new User();
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/confirmation")
	public ModelAndView Confirmation() {
	
		ModelAndView model = new ModelAndView("user_confirmation");
		User user = new User();
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/login")
	public ModelAndView validateUser(@ModelAttribute User user) {
		
		ModelAndView model = new ModelAndView("blank");
		User validateUser = userService.validateUserAndPassword(user);
		model.addObject("user", validateUser);
		return model;
	}
	
	@RequestMapping("/createUser")
	public ModelAndView createUser(@ModelAttribute User user) {
		
		user.setRole("customer");
		ModelAndView model = new ModelAndView("blank");
		User validateUser = userService.createUser(user);
		model.addObject("user", validateUser);
		
		return model;
	}
	
	@RequestMapping("/getAllCookies")
	public ModelAndView getAllCookies() {
		
		ModelAndView model = new ModelAndView("user_store");
		List<Cookie> cookies = cookieService.getAllCookies();
		model.addObject("cookies", cookies);
		
		return model;
	}
}
