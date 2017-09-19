package com.chencoder.demo.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import com.chencoder.demo.pojo.BlogExample;
import com.chencoder.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@Autowired
	BlogService blogService;
	
    @RequestMapping("/hi")
	public String hello(Locale locale, Model model) {
		model.addAttribute("greeting", "Hello!");

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);        
		String formattedDate = dateFormat.format(date);
		model.addAttribute("currentTime", formattedDate);
		int count = blogService.countByExample(new BlogExample());
		model.addAttribute("count", count);
		return "hello";
	}

}