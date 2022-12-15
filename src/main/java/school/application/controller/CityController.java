package school.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import school.application.services.CityService;
import school.application.services.CityServiceInterface;

@RestController
@RequestMapping("/city")

public class CityController {
	@Autowired
	private CityServiceInterface cityService;
	
	@CrossOrigin
	@GetMapping("/city-list")
	public Object getCityList() {
		 return cityService.getCityList();	 
	}

	
}
