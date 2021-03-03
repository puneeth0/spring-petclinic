package org.pet.clinic.web.controller;

import org.pet.clinic.data.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

	private VetService vetService;
	
	
	public VetsController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
	public String listOfVets(Model model) {
		
		model .addAttribute("vets", vetService.findall());
		return "vets/index";
	}
}
