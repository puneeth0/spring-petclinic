package org.pet.clinic.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

	@RequestMapping({"","/","index","index.html"})
	public String index()
	{
		log.debug("loading index page");
		return "index";
	}
	
	
	@RequestMapping("/oups")
	public String oups(Model model) {
		return "workinprogress";
	}
}
