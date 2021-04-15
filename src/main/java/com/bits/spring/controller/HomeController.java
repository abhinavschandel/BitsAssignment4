package com.bits.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bits.spring.model.User;

@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	try {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		//DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		DateFormat dateFormat = DateFormat.getDateInstance();

		String formattedDate = dateFormat.format(date);

 	model.addAttribute("message", "Welcome to Bits Pillani");
		model.addAttribute("serverTime", formattedDate);
}catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
 
		return "home";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Loading...");
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
}
