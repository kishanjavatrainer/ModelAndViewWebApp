package com.infotech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.User;
import com.infotech.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/listUsers",method=RequestMethod.GET)
	public ModelAndView registerSuccess(ModelAndView modelAndView ){
		modelAndView.setViewName("UserList");
		List<User> userList = userService.getUserList();
		modelAndView.addObject("userList",userList);
		return modelAndView;
	}
	
	/*@RequestMapping(value="/listUsers",method=RequestMethod.GET)
	public ModelAndView registerSuccess(){
		ModelAndView modelAndView = new ModelAndView("UserList");
		List<User> userList = userService.getUserList();
		modelAndView.addObject("userList",userList);
		return modelAndView;
		
	}*/
	
}
