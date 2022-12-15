package school.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import school.application.services.SubjectServiceInterface;

@RestController
@RequestMapping("/subject")

public class SubjectController {
	@Autowired
	
	public SubjectServiceInterface subjectService;
	@CrossOrigin
	@GetMapping("/subject-list")
	public Object getSubjestList() {
		return subjectService.getSubjectList();
	}

}
