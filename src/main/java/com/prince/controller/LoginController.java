package com.prince.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
@RequestMapping("/login")
	public ModelAndView checkLogin(HttpServletRequest req,HttpServletResponse resp){
		
		String user=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		ModelAndView mv= new ModelAndView();
		if(user.equals("praveen") && pwd.equals("gupta"))
		{
			mv.setViewName("success.jsp");
		}
		else
			mv.setViewName("index.jsp");
		
		return mv;
	}
	
}
