package org.pet.clinic.web.controller;

import org.pet.clinic.data.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({"/owners","/owners/index","/owners/index.html"})
	public String listOfOwners(Model model) {
		model.addAttribute("owners", ownerService.findall());
		return "owner/index";
	}
}
