package com.chinasofti.onebox.onebox_web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chinasofti.onebox.onebox_web.domain.User;
import com.chinasofti.onebox.onebox_web.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/showUser/{userId}", method = RequestMethod.GET)
	public String toIndex(HttpServletRequest request, @PathVariable Integer userId, Model model) {

		User user = this.userService.getUserById(userId);
		model.addAttribute(user);

		return "showUser";
	}
}
