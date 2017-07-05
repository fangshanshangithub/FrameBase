package com.frame.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.frame.ssm.pojo.User;
import com.frame.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	// 日志功能
	public static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/showUser.do")
	public String toIndex(HttpServletRequest request,Model model) {
		int userId = Integer.parseInt(request.getParameter("id")); 
		logger.info("********传过来的UserId = " + userId);
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
		return "showUser";
	}
	
}
