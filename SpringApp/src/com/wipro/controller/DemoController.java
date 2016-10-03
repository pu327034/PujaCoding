package com.wipro.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {

@RequestMapping(value ="first", method = RequestMethod.GET)
public ModelAndView home()
{
	String now=(new Date()).toString();
	ModelAndView model=new ModelAndView("Hello");
	model.addObject("Time", now);
	return model;
}
}
