package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/test")
public class TestController {
	
	@RequestMapping("/toindex")
	public String test()
	{
		return "index";
	}

}
