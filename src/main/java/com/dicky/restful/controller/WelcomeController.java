/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicky.restful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dicky-java
 */

@Controller
public class WelcomeController {
    
    	@RequestMapping("/")
        @ResponseBody
	public ModelAndView showLandingPage() {
		ModelAndView model = null;
		try {
			model = new ModelAndView("index");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
        
    
}
