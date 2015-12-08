package net.viralpatel.spring3.controller;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("hello", "message", message);
	}
}
