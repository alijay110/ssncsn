package com.pearson.sam.sessioncaching.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginManagementController {
	private static int counter = 0;
	@GetMapping(value = "/")
	public String login(HttpServletRequest request, HttpSession session) {
		/*
		 * create new session if session is not new
		 */
		if (!session.isNew()) {
			counter +=1;
			//session.invalidate();
			session = request.getSession();
			System.out.println("!session.isNew() true \n get existing session \n " + counter +"\n" + session.toString());
			
		}
			
		
		return "Logged in & valid user";
	}


	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpSession session) {
		session.invalidate();
		return "/login";
	}



	//@RequestMapping(value = "/home", method = RequestMethod.GET)
	@GetMapping(value = "/cookies/add")
    public String home(HttpServletResponse response) {
        //create a cookie with name 'website' and value 'javapointers'
		Cookie cookie = new Cookie("role", "admin");
		Cookie cookie1 = new Cookie("token", "12345");
        //set the expiration time
        //1 hour = 60 seconds x 60 minutes
		cookie.setMaxAge(60 * 1);
		cookie1.setMaxAge(60 * 1);
        //add the cookie to the  response
		response.addCookie(cookie);
		response.addCookie(cookie1);
        //return the jsp with the response
        return "cookies added";
    }
	//@RequestMapping(value = "/home/cookie", method = RequestMethod.GET)
	@GetMapping(value = "/cookies")
    public String readCookie(HttpServletRequest request) {
        //get all cookies
		Cookie[] cookies = request.getCookies();
		StringBuffer sbCookies = new StringBuffer();
        //iterate each cookie
        for (Cookie cookie : cookies) {
            //display only the cookie with the name 'website'
				sbCookies.append("\nName:" + cookie.getName() + "\nValue: " + cookie.getValue());
                  
		}
		System.out.println(sbCookies.toString());
        return sbCookies.toString();
    }
}
