package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.User;
import com.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService mUserService;

	@RequestMapping("index.html")
	public String toJspView(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = mUserService.getUserById(1);
		if (user != null) {
			session.setAttribute("user", user);
		}
		return "index";

	}
}
