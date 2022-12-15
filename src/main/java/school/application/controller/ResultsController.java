package school.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.application.services.ResultsServiceInterface;

@RestController
@RequestMapping("/results")

public class ResultsController {
	@Autowired
	public ResultsServiceInterface resultsService;
	@CrossOrigin
	@GetMapping("/results-list")
	public Object getResultsList () {
		return resultsService.getResultslist();
	}

}
