package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping(value="/log")
	public String m1()
	{
		System.out.println("m1 method");
		return "showmsg";
	}
}
