package com.wipro.welcome.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
@RequestMapping(value="/", method=RequestMethod.GET)
public String index()
{
	return "index";}
@RequestMapping(value="/welcome", method=RequestMethod.POST)
public String welcome(@ModelAttribute Welcome wel,Map<String,String>map)
{
	map.put("ms",wel.getName());
	return "welcome";
	}
}
